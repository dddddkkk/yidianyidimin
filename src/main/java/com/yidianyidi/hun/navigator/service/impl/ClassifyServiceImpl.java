package com.yidianyidi.hun.navigator.service.impl;

import com.yidianyidi.hun.navigator.mapper.ClassifyMapper;
import com.yidianyidi.hun.navigator.modle.po.ClassifyPO;
import com.yidianyidi.hun.navigator.modle.req.ClassifyAddreq;
import com.yidianyidi.hun.navigator.modle.resp.ClassifyQueryResp;
import com.yidianyidi.hun.navigator.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    ClassifyMapper classifyMapper;
    @Override
    public Long addClassify(ClassifyAddreq classifyAddreq) {
        ClassifyPO classifyPO=new ClassifyPO();
        classifyPO.setName(classifyAddreq.getName());
        Long row=classifyMapper.add(classifyPO);

        return row;
    }

    @Override
    public List<ClassifyQueryResp> queryList() {
        List<ClassifyPO> list=classifyMapper.queryAll();
        List<ClassifyQueryResp> roots=new LinkedList<>();
        if(!CollectionUtils.isEmpty(list))
        {
            applyClassifyRoot(list,roots);
            if(!CollectionUtils.isEmpty(roots)){
                for(ClassifyQueryResp root:roots)
                {
                    recursionChild(root,list);

                }
            }

        }
        return roots;
    }

    /**
     * 查询父节点
     * @param list
     * @param roots
     */
    private void applyClassifyRoot(List<ClassifyPO> list,List<ClassifyQueryResp>  roots )
    {
        Iterator<ClassifyPO> iterator=list.iterator();
        while (iterator.hasNext()){
            ClassifyPO next=iterator.next();
            //找出根节点
            if(next.getParentI()!=null && next.getParentI()==0)
            {
                ClassifyQueryResp classifyQueryResp=new ClassifyQueryResp();
                classifyQueryResp.setId(next.getId());
                classifyQueryResp.setName(next.getName());
                classifyQueryResp.setParentId(next.getParentI());
                classifyQueryResp.setType(next.getType());
                roots.add(classifyQueryResp);
                iterator.remove();
            }
        }

    }
    /**
     * 查询子节点
     */
    private  void recursionChild(ClassifyQueryResp root,List<ClassifyPO> list)
    {
        Iterator<ClassifyPO> iterator=list.iterator();
        List<ClassifyQueryResp> childList=new LinkedList<>();
        while (iterator.hasNext())
        {
            ClassifyPO next=iterator.next();
            if(root.getId().equals(next.getParentI()))
            {
                ClassifyQueryResp resp=new ClassifyQueryResp();
                resp.setid(next.getId());
                resp.setParentId(next.getParentI());
                resp.setName(next.getName());
                resp.setType(next.getType());
                childList.add(resp);
                recursionChild(resp,list);

            }
        }
        root.setChildrenList(childList);
    }
}
