package com.fastruck.fastruck;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fastruck.fastruck.model.Foodtruck;

/**
 * Created by jean-pascal on 08/02/2015.
 */
public class FoodtruckAdapter extends ArrayAdapter<Foodtruck> {

    private final Context context;
    private final Foodtruck[] foodtrucks;

    public FoodtruckAdapter(Context context, Foodtruck[] foodtrucks) {
        super(context, R.layout.foodtruckitem, foodtrucks);
        this.context = context;
        this.foodtrucks = foodtrucks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.foodtruckitem, parent, false);
        TextView firstLine = (TextView) rowView.findViewById(R.id.firstLine);
        TextView secondLine = (TextView) rowView.findViewById(R.id.secondLine);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        /*if (values[position].equals("Le Camion qui fume"))
            imageView.setImageResource(R.drawable.camionquifume);
        else if(values[position].equals("La Cantine California"))
            imageView.setImageResource(R.drawable.cantinecalifornia);
        else if(values[position].equals("Glazed"))
            imageView.setImageResource(R.drawable.wideglaceglazed);
        else if(values[position].equals("Le refectoire"))
            imageView.setImageResource(R.drawable.lerefectoire);
        textView.setText(values[position]);*/
        Foodtruck ft = foodtrucks[position];
        Log.v("adapter", "################################");
        Log.v("adapter", ft.getName() + " ; " + position);
        firstLine.setText(ft.getName());
        secondLine.setText(ft.getDescription());
        imageView.setImageResource(ft.getImageResourceId());

        return rowView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
