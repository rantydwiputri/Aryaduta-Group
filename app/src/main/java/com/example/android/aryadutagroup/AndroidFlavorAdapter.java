package com.example.android.aryadutagroup;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * {@link AndroidFlavorAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link AndroidFlavor} objects.
 * */
public class AndroidFlavorAdapter extends ArrayAdapter<AndroidFlavor> {

    private static final String LOG_TAG = AndroidFlavorAdapter.class.getSimpleName();

    public AndroidFlavorAdapter(Activity context, ArrayList<AndroidFlavor> androidFlavors) {

        super(context, 0, androidFlavors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        AndroidFlavor currentAndroidFlavor = getItem(position);


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);

        nameTextView.setText(currentAndroidFlavor.getVersionName());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.location_text_view);

        numberTextView.setText(currentAndroidFlavor.getVersionNumber());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());

        return listItemView;
    }

}

