package com.sidneyjackson.technica_2017;

import android.net.Uri;

/**
 * Created by sidneyjackson on 11/5/17.
 */

public class WebLinkObject {
    Uri img;
    String webLinkTitle;
    String webLinkDesc;
    String webLink;

    WebLinkObject(Uri uri, String wT, String wD, String wL) {
        img = uri;
        webLinkTitle = wT;
        webLinkDesc = wD;
        webLink = wL;
    }

}
