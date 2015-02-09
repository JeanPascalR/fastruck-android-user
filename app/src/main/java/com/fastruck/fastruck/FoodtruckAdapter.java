package com.fastruck.fastruck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jean-pascal on 08/02/2015.
 */
public class FoodtruckAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public FoodtruckAdapter(Context context, String[] values) {
        super(context, R.layout.foodtruckitem, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.foodtruckitem, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.firstLine);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        if (values[position].equals("Le Camion qui fume"))
            imageView.setImageResource(R.drawable.camionquifume);
        else if(values[position].equals("La Cantine California"))
            imageView.setImageResource(R.drawable.cantinecalifornia);
        else if(values[position].equals("Glazed"))
            imageView.setImageResource(R.drawable.wideglaceglazed);
        else if(values[position].equals("Le refectoire"))
            imageView.setImageResource(R.drawable.lerefectoire);
        textView.setText(values[position]);
        // change the icon for Windows and iPhone
        /*String s = values[position];
        if (s.startsWith("iPhone")) {
            imageView.setImageResource(R.drawable.no);
        } else {
            imageView.setImageResource(R.drawable.ok);
        }*/

        return rowView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
