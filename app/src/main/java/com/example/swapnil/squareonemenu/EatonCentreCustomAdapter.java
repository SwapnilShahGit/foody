package com.example.swapnil.squareonemenu;

/**
 * Created by oguzhan on 2015-05-29.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class EatonCentreCustomAdapter extends ArrayAdapter<String>{

    Integer[] imageId = {R.drawable.aw, R.drawable.amaya, R.drawable.image3,
            R.drawable.bigsmokeburger,
            R.drawable.image3,R.drawable.image3,R.drawable.image3,R.drawable.image3, R.drawable.image3,
            R.drawable.image3,R.drawable.image3,R.drawable.image3,R.drawable.image3,R.drawable.image3,
            R.drawable.image3, R.drawable.image3, R.drawable.image3,R.drawable.image3,R.drawable.image3,
            R.drawable.image3,R.drawable.image3,R.drawable.image3,R.drawable.image3,
            R.drawable.image3,R.drawable.image3, R.drawable.image3,R.drawable.image3,
            R.drawable.image3,R.drawable.image3, R.drawable.image3,R.drawable.image3,
            R.drawable.image3,R.drawable.image3, R.drawable.image3,R.drawable.image3,
            R.drawable.image3,R.drawable.image3};

    EatonCentreCustomAdapter(Context context, String[] restaurants, Integer[] images) {

        super(context, R.layout.eatoncentrecustomrow, restaurants);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater squareOneInflater = LayoutInflater.from(getContext());
        View customView = squareOneInflater.inflate(R.layout.eatoncentrecustomrow, parent, false);

        String singleFoodItem = getItem(position);

        TextView eatoncentreText = (TextView) customView.findViewById(R.id.eatoncentrePlaceText);


        ImageView eatoncentreImage = (ImageView) customView.findViewById(R.id.eatoncentrePlaceImage); //buckysImage is after the .id


        eatoncentreText.setText(singleFoodItem);

        eatoncentreImage.setImageResource(imageId[position]);
        return customView;
    }
}