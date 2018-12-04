package com.example.fakharali.volley_one;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Fakhar Ali on 11/30/2018.
 */

public class Expandable_list extends BaseExpandableListAdapter {
    String[] parent= {" Computer","Sports","Vehicals"};
    String[][] child=  {{" Desktop","Computers","Laptops"},{"Cricket","Hockey","Video Games"},{"Car","Bus"}};

    Context context;

    public Expandable_list(Context context){
        this.context=context;
    }


    @Override
    public int getGroupCount() {
        return parent.length;
    }

    @Override
    public int getChildrenCount(int i) {
        return child.length;
    }

    @Override
    public Object getGroup(int gpos) {
        return parent[gpos];
    }

    @Override
    public Object getChild(int gpos, int cpos) {
        return child[gpos][cpos];
    }

    @Override
    public long getGroupId(int gpos) {
        return gpos;
    }

    @Override
    public long getChildId(int gpos, int cpos) {
        return cpos;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int gpos, boolean b, View view, ViewGroup viewGroup) {

        TextView txtview=new TextView(context);
        txtview.setText(parent[gpos]);
        txtview.setTextSize(30);
        txtview.setPadding(30, 0,0,0);
        txtview.setTextColor(Color.BLUE);
        return txtview;

    }

    @Override
    public View getChildView(int gpos, final int cpos, boolean b, View view, ViewGroup viewGroup) {
        final TextView txtview=new TextView(context);
        txtview.setText(child[gpos][cpos]);
        txtview.setTextSize(30);
        txtview.setTextColor(Color.RED);
        txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,txtview.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

        return txtview;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
