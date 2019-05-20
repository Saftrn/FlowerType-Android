package ca.sa.poe.flowertype;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FlowersDataDetail extends AppCompatActivity {
    public static final String EXTRA_FLOWERS = "extra_flower";
    TextView tvNama, tvGenus, tvData, tvClade, tvOrder, tvJenis;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers_data_detail);

        tvNama = findViewById(R.id.tv_item_name);
        tvGenus = findViewById(R.id.tv_item_genus);
        tvData = findViewById(R.id.tv_item_data);
        tvClade = findViewById(R.id.tv_item_clade);
        tvOrder = findViewById(R.id.tv_item_order);
        tvJenis = findViewById(R.id.tv_item_jenis);
        imgPhoto = findViewById(R.id.img_item_photo);

        Flowers flowers = getIntent().getParcelableExtra(EXTRA_FLOWERS);
        String tv_nama, tv_genus, tv_data, tv_clade, tv_order, tv_jenis, img_Photo;

        tv_nama = flowers.getName();
        tv_genus = flowers.getGenus();
        tv_data = flowers.getData();
        tv_clade = flowers.getClade();
        tv_jenis = flowers.getJenis();
        tv_order = flowers.getOrder();
        img_Photo = flowers.getPhoto();

        tvNama.setText(tv_nama);
        tvGenus.setText(tv_genus);
        tvData.setText(tv_data);
        tvClade.setText(tv_clade);
        tvOrder.setText(tv_order);
        tvJenis.setText(tv_jenis);

        RequestManager requestManager = Glide.with(this);
        RequestBuilder requestBuilder = requestManager.load(img_Photo);
        requestBuilder.into(imgPhoto);






//--------------------------------------------------------------------
//        Bitmap bitmap = null;
//
//        InputStream in = null;
//        try {
//            in = new URL(img_Photo).openStream();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        bitmap = BitmapFactory.decodeStream(in);
//
//        imgPhoto.setImageBitmap(bitmap);
//-------------------------------------------------------------------
//        URL url = null;
//        try {
//            url = new URL(img_Photo);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        InputStream content = null;
//        try {
//            content = (InputStream)url.getContent();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Drawable d = Drawable.createFromStream(content , "src");
//        imgPhoto.setImageDrawable(d);
//-------------------------------------------------------------------
//        WebView picView;
//        picView = (WebView)findViewById(R.id.img_item_photo);
//
//        picView.loadUrl(img_Photo);
//-------------------------------------------------------------------
//        try {
//            URL url = new URL(img_Photo);
//            InputStream content = (InputStream)url.getContent();
//            Drawable d = Drawable.createFromStream(content , "src");e
//            imgPhoto.setImageDrawable(d);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
