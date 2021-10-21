package com.krachkovsky.mynewsappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.krachkovsky.mynewsappv2.Models.NewsHeadlines;

public class DetailsActivity extends AppCompatActivity {

    NewsHeadlines headlines;
    TextView txtTitle, txtAuthor, txtTime, txtDetail, txtContent;
    ImageView imgNews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txtTitle = findViewById(R.id.text_detail_title);
        txtAuthor = findViewById(R.id.text_detail_author);
        txtTime = findViewById(R.id.text_detail_time);
        txtDetail = findViewById(R.id.text_detail_detail);
        txtContent = findViewById(R.id.text_detail_content);
        imgNews = findViewById(R.id.img_detail_news);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        if (headlines.getTitle() != null) {
            txtTitle.setText(headlines.getTitle());
        }
        if (headlines.getAuthor() != null) {
            txtAuthor.setText(headlines.getAuthor());
        }
        if (headlines.getPublishedAt() != null) {
            txtTime.setText(headlines.getPublishedAt());
        }
        if (headlines.getDescription() != null) {
            txtDetail.setText(headlines.getDescription());
        }
        if (headlines.getContent() != null) {
            txtContent.setText(headlines.getContent());
        }
        if (headlines.getUrlToImage() != null) {
            Glide.with(this).load(headlines.getUrlToImage()).into(imgNews);
        }
    }
}