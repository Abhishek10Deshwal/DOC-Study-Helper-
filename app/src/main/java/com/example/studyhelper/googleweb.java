package com.example.studyhelper;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class googleweb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googleweb);

        WebView webView = findViewById(R.id.wv10);

        // Set up a custom WebViewClient to handle page loading
        webView.setWebViewClient(new WebViewClient() {
            @RequiresApi(api = 21) // For Lollipop and above
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return false; // Allow WebView to handle the URL
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                // Hide loading indicator here if you have one
            }
        });

        WebSettings webSettings = webView.getSettings();

        // Enable JavaScript for modern web features
        webSettings.setJavaScriptEnabled(true);

        // Enable DOM storage for better compatibility with modern web apps
        webSettings.setDomStorageEnabled(true);

        // Use caching to load previously accessed resources faster
        webSettings.setAppCacheEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        // Enable hardware acceleration for better performance
        webView.setLayerType(WebView.LAYER_TYPE_HARDWARE, null);

        // Improve image and resource loading speed
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setBlockNetworkImage(false);

        // Adjust text size for readability (optional)
        webSettings.setTextZoom(100);

        // Load the desired website
        webView.loadUrl("https://iask.ai");
    }
}



//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.AlertDialog;
//import android.app.DownloadManager;
//import android.content.DialogInterface;
//import android.graphics.Bitmap;
//import android.net.Uri;
//import android.os.Bundle;
//import android.webkit.DownloadListener;
//import android.webkit.WebSettings;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//import android.widget.Toast;
//
//public class googleweb extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_googleweb);
//        WebView wv = (WebView) findViewById(R.id.wv10);
//        wv.loadUrl("https://www.youtube.com/");// add your link here
//        wv.setWebViewClient(new Client());
//        WebSettings ws = wv.getSettings();
//        ws.setJavaScriptEnabled(true);
//        wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//        wv.clearCache(true);
//        wv.clearHistory();
//
//        wv.setDownloadListener(new DownloadListener() {
//            @Override
//            public void onDownloadStart(String url, String s1, String s2, String s3, long l) {
//                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url));
//                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
//                dm.enqueue(req);
//
//                Toast.makeText(googleweb.this, "Downloading....", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    private class Client extends WebViewClient {
//        @Override
//        public void onPageStarted(WebView view, String url, Bitmap favicon) {
//            super.onPageStarted(view, url, favicon);
//        }
//
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            view.loadUrl(url);
//            return true;
//        }
//
//        @Override
//        public void onPageFinished(WebView view, String url) {
//            super.onPageFinished(view, url);
//        }
//
//        public void onReceivedError(WebView webView, int errorCode, String description, String failingUrl) {
//            try {
//                webView.stopLoading();
//            } catch (Exception e) {
//            }
//
//            if (webView.canGoBack()) {
//                webView.goBack();
//            }
//
//            webView.loadUrl("about:blank");
//            AlertDialog alertDialog = new AlertDialog.Builder(googleweb.this).create();
//            alertDialog.setTitle("Error");
//            alertDialog.setMessage("Check your internet connection and try again.");
//            alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Try Again", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int which) {
//                    finish();
//                    startActivity(getIntent());
//                }
//            });
//
//            alertDialog.show();
//            super.onReceivedError(webView, errorCode, description, failingUrl);
//        }
//    }
//}
