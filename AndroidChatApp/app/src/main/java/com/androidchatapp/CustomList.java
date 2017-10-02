package com.androidchatapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vikas on 02-Oct-17.
 */

public class CustomList extends ArrayAdapter<String> {

    private final Context context;
    private final ArrayList<String> al;

    public CustomList(Context context,ArrayList<String> al) {
        super(context, R.layout.custom_list);
        this.context = context;
        this.al=al;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater ;

        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView= inflater.inflate(R.layout.custom_list, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.Itemname);

        txtTitle.setText(al.get(position));

        return rowView;
    }
}
