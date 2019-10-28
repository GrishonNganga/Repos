package com.grishon.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.grishon.Model.User;
import com.grishon.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

        private List<User> userList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView username, user_state;
            CircleImageView circleImageView;



            public MyViewHolder(View view) {
                super(view);
                username = view.findViewById(R.id.user_name);
                user_state = view.findViewById(R.id.userstate);
                circleImageView = view.findViewById(R.id.avatar);
            }
        }


        public UserAdapter(List<User> userList) {
            this.userList = userList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.userlist_item, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {
            final User user = userList.get(position);

            holder.username.setText(user.getLogin());
            holder.user_state.setText("Nairobi");

            Context context = holder.circleImageView.getContext();
            Glide.with(context).load(user.getAvatarUrl()).into(holder.circleImageView);

        }

        @Override
        public int getItemCount() {
            return userList.size();
        }
    }
