package com.sidneyjackson.technica_2017;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private ListView webLinkListView;
    protected static ArrayList<WebLinkObject> webLinkItems;
    protected static WebLinkAdapter wlAdapter;
    protected View rootView;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();

        webLinkItems = populateWebLinkList();

        wlAdapter = new WebLinkAdapter(getActivity(), R.layout.web_link_row, webLinkItems);
        webLinkListView.setAdapter(wlAdapter); // Layout File

        getActivity().setTitle("News Feed");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_home, container, false);

        webLinkListView = (ListView) rootView.findViewById(R.id.web_link_list_view);

        webLinkListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Do Nothing
            }
        });

        return rootView;
    }

    public ArrayList<WebLinkObject> populateWebLinkList() {
        ArrayList<WebLinkObject> webLinks = new ArrayList<>();


        Uri uri_1 = Uri.parse("android.resource://com.sidneymjackson.technica_2017/R.drawable.web_img_3");
        Uri uri_2 = Uri.parse("android.resource://com.sidneymjackson.technica_2017/R.drawable.web_img_1");
        Uri uri_3 = Uri.parse("android.resource://com.sidneymjackson.technica_2017/R.drawable.web_img_2");

        WebLinkObject webLink1 = new WebLinkObject(uri_1, "How to Manage Money", "Managing money can be tough, but with this guide... ", "moneymanager.com");
        WebLinkObject webLink2 = new WebLinkObject(uri_2, "How to Fundraise", "Fundraising can be tough, but with this guide... ", "fundmydream.com");
        WebLinkObject webLink3 = new WebLinkObject(uri_3, "How to Reach Out", "Reaching out can be tough, but with this guide... ", "allinthistogether.com");

        return webLinks;
    }

}
