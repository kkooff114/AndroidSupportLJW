package com.ljw.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ljw.a.ui.material.reveal.FirstActivity;


public class MainActivity2Activity extends ActionBarActivity {

    RecyclerView list;

    private final String[] title = {"materal跳转"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        list = (RecyclerView) findViewById(R.id.list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // 设置LinearLayoutManager
        list.setLayoutManager(layoutManager);
        // 设置ItemAnimator
        list.setItemAnimator(new DefaultItemAnimator());
        // 设置固定大小
        list.setHasFixedSize(true);
        list.setAdapter(new adapter(MainActivity2Activity.this));


    }

    class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{

        private LayoutInflater inflater;

        public adapter(Context context){
            inflater = LayoutInflater.from(context);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            return new ViewHolder(inflater.inflate(R.layout.item_test_list,null));
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.title.setText(title[position]);
        }

        @Override
        public int getItemCount() {
            return title.length;
        }

        class ViewHolder extends RecyclerView.ViewHolder{

            public TextView title;

            public ViewHolder(View itemView) {
                super(itemView);
                title = (TextView) itemView.findViewById(R.id.title);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent;
                        switch (getLayoutPosition()){
                            case 0:
                                intent = new Intent(MainActivity2Activity.this, FirstActivity.class);
                                startActivity(intent);

                                break;
                        }
                    }
                });
            }


        }
    }


}
