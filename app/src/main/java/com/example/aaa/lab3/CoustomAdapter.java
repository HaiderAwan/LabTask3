package com.example.aaa.lab3;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by aaa on 10/3/2017.
 */

public class CoustomAdapter extends ArrayAdapter {


    public CoustomAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    class ViewHolder {
        TextView tvfirst;
        TextView tvphone;
        ImageView imageView;
    }
    //   private Contacts[]contact;



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View convertview = convertView;
        ViewHolder vh ;
        Contacts contacts = getItem(position);
        if (convertview == null) {
            convertview = LayoutInflater.from(getContext()).inflate(R.layout.coustomlayout, parent, false);
            TextView tvfirstname = (TextView) convertview.findViewById(R.id.firstnametv);
            TextView tvphoneno = (TextView) convertview.findViewById(R.id.phonenotv);
            ImageView imageView = (ImageView) convertview.findViewById(R.id.imageView);

            vh= new ViewHolder();
            vh.tvfirst = tvfirstname;
            vh.tvphone = tvphoneno;
            vh.imageView=imageView;

            convertview.setTag(vh);

        }

        vh = (ViewHolder) convertview.getTag();
        vh.tvfirst.setText(contacts.getFirstname());
        vh.tvphone.setText(contacts.getPhone());
        return convertview;

    }
}
