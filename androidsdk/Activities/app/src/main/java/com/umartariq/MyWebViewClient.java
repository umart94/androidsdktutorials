package com.umartariq;



import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;

import static android.content.ContentValues.TAG;

public class MyWebViewClient extends WebViewClient {

    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if (!url.startsWith("https://www.checkmarx.com"))
            url = "https://www.checkmarx.com/contact-us";

        webView.loadUrl(url);
        return true;
    }

    @RequiresApi(Build.VERSION_CODES.N)
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        final Uri uri = request.getUrl();
        return handleUri(view, uri);
    }

    //fix for super.shouldOverrideUrlLoading() -- never call super , otherwise both deprecated and nondeprecated will be called
    /*
    Just like shouldOverrideUrlLoading, you can come up with a similar approach for shouldInterceptRequest method.
     */
    private boolean handleUri(WebView view, final Uri uri) {
        Log.i(TAG, "Uri =" + uri);
        final String host = uri.getHost();
        final String scheme = uri.getScheme();
        // Based on some condition you need to determine if you are going to load the url
        // in your web view itself or in a browser.
        // You can use `host` or `scheme` or any part of the `uri` to decide.
        if (!host.startsWith("https://www.checkmarx.com")) {
            // Returning false means that you are going to load this url in the webView itself
            return false;
        } else {
            // Returning true means that you need to handle what to do with the url
            // e.g. open web page in a Browser
            final Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            view.getContext().startActivity(intent);
            return true;
        }
    }
}

