package com.anarchy.classifyview.sample.normal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anarchy.classify.ClassifyView;
import com.anarchy.classifyview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * <p/>
 * Date: 16/6/12 09:51
 * Author: zhendong.wu@shoufuyou.com
 * <p/>
 */
public class NormalFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.normal,container,false);
        ClassifyView classifyView = (ClassifyView) view.findViewById(R.id.classify_view);
        List<List<Bean>> data = new ArrayList<>();
        for(int i=0;i<30;i++){
            List<Bean> inner = new ArrayList<>();
            if(i>10) {
                int c = (int) (Math.random() * 15+1);
                for(int j=0;j<c;j++){
                    inner.add(new Bean());
                }
            }else {
                inner.add(new Bean());
            }
            data.add(inner);
        }
        classifyView.setAdapter(new MyAdapter(data));
        return view;
    }
}
