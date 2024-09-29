package com.example.recyclerview;

import android.content.Intent;
import android.widget.Toast;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<State> states;

    StateAdapter(Context context, List<State> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        State state = states.get(position);
        holder.flag.setImageResource(state.getFlagResource());
        holder.nameView.setText(state.getName());
        //holder.capitalView.setText(state.getCapital());

        holder.itemView.setOnClickListener(v -> {
            String message = "Страна: " + state.getName();
            Toast.makeText(v.getContext(), message, Toast.LENGTH_LONG).show();
            Context context = v.getContext();
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("name", state.getName());
            intent.putExtra("capital", state.getCapital());
            intent.putExtra("flag", state.getFlagResource());
            intent.putExtra("description", state.getDescription());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flag;
        final TextView nameView;
        final TextView capitalView;

        ViewHolder(View view) {
            super(view);
            flag = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.capital);
        }
    }
}