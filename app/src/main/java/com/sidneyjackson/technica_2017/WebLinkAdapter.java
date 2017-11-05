package com.sidneyjackson.technica_2017;

/**
 * Created by sidneyjackson on 11/5/17.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WebLinkAdapter extends ArrayAdapter<WebLinkObject> {
    int res;
    Uri img;
    String webLinkTitle;
    String webLinkDesc;
    String webLink;

    public WebLinkAdapter(Context ctx, int res, List<WebLinkObject> items)  {
        super(ctx, res, items);
        this.res = res;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout webLinkListView;
        final WebLinkObject webLinkSelectedItem = getItem(position);

        if (convertView == null) {
            webLinkListView = new LinearLayout(getContext());
            String inflater = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(inflater);
            vi.inflate(res, webLinkListView, true);
        } else {
            webLinkListView = (LinearLayout) convertView;
        }

        img = webLinkSelectedItem.img;
        webLinkTitle = webLinkSelectedItem.webLinkTitle;
        webLinkDesc = webLinkSelectedItem.webLinkDesc;
        webLink = webLinkSelectedItem.webLink;

        ImageView webLinkThumbnailTV= (ImageView) webLinkListView.findViewById(R.id.thumbnailID);
        TextView webLinkTitleTV = (TextView) webLinkListView.findViewById(R.id.titleID);
        TextView webLinkDescTV = (TextView) webLinkListView.findViewById(R.id.descriptionID);
        TextView webLinkTV = (TextView) webLinkListView.findViewById(R.id.linkID);

        webLinkThumbnailTV.setImageURI(img);
        webLinkTitleTV.setText(webLinkTitle);
        webLinkDescTV.setText(webLinkDesc);
        webLinkTV.setText(webLink);

        return webLinkListView;
    }
}
