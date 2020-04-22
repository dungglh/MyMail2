package com.example.mymail2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MyMailItemModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add((new MyMailItemModel("Wang Yibo", "Yo Honey","Hello, It's me, Wang Yibo. Nice to meet you","1:30pm")));
        items.add((new MyMailItemModel("Oh Sehun", "Wassup bro","Hello, I am Oh Sehun. Nice to meet you","2:30am")));
        items.add((new MyMailItemModel("Kim Junmyeon", "Hello my friend","Hello, I am Kim Junmyeon. Nice to meet you","2:30am")));
        items.add((new MyMailItemModel("Kim Jongun", "Hello my friend","Hello, I am Kim Jungun. Nice to meet you","2:30am")));
        items.add((new MyMailItemModel("Lana Del Rey", "Hello my friend","Hello, I am Lana Del Rey. Nice to meet you","2:30am")));
        items.add((new MyMailItemModel("Byeon Baekhyun", "Hello my girl","Hello, I'm Baekhyun. Nice to meet you","2:30am")));
        items.add((new MyMailItemModel("Park Chanyeol", "Hello my girl","Hello, I'm Park Chanyeol. Nice to meet you","2:30am")));
        items.add((new MyMailItemModel("Taylor Swift", "Hi bro","Hello, I'm your Taylor. Long time no see you. Are you ok?","2:30am")));
        items.add((new MyMailItemModel("Kim Jinu", "Hi bro","Yeh, It's Jinu. Long time no see you. Are you ok?","2:30am")));
        items.add((new MyMailItemModel("Luong Xuan Truong", "Hi!","LXT. Long time no see you. Are you ok?","2:30am")));
        items.add((new MyMailItemModel("Ariana Grande", "Hi! my friend","Ari. Long time no see you. Are you ok?","2:30am")));
        items.add((new MyMailItemModel("Donal Trump", "Hi! my friend","Yo, my best friend. Long time no see you. Are you ok?","2:30am")));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MyMailItemAdapter adapter = new MyMailItemAdapter(items);
        recyclerView.setAdapter(adapter);

    }

}
