package you.xiaochen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;

/**
 * Created by you on 2017/3/15.
 */

public class Fragment2 extends Fragment {

    private WebView mWebView;

    private ProgressBar mProgress;

    public static Fragment2 newInstance() {
        Fragment2 fragment = new Fragment2();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, container, false);
        mWebView = (WebView) v.findViewById(R.id.mWebView);
        mProgress = (ProgressBar) v.findViewById(R.id.mProgress);
        JsCallBack.initWebView(mWebView, mProgress);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mWebView.loadUrl("file:///android_asset/youxiaochen/index.html");
    }
    
}
