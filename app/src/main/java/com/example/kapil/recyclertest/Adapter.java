package com.example.kapil.recyclertest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kapil on 01-07-2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>
{
	private List<CardView> listItems;
	
	
	public Adapter(List<CardView> listItems)
	{
		this.listItems = listItems;
	}
	
	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		View v = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.card_view, parent, false);
		return new ViewHolder(v);
	}
	
	@Override
	public void onBindViewHolder(ViewHolder holder, int position)
	{
//		CardView listItem = listItems.get(position);
		holder.TextViewHead.setText(listItems.get(position).getHead());
		holder.TextViewDesc.setText(listItems.get(position).getDesc());
	}
	
	@Override
	public void onAttachedToRecyclerView(RecyclerView recyclerView)
	{
		super.onAttachedToRecyclerView(recyclerView);
	}
	
	@Override
	public int getItemCount()
	{
		if(listItems.size()==0)
			return 0;
		else
			return (int) listItems.size();
	}
	
	public class ViewHolder extends RecyclerView.ViewHolder
	{
		private TextView TextViewHead;
		private TextView TextViewDesc;
		
		ViewHolder(View itemView)
		{
			super(itemView);
			TextViewHead = (TextView) itemView.findViewById(R.id.texthead);
			TextViewDesc = (TextView) itemView.findViewById(R.id.textdesc);
			
		}
	}
}
