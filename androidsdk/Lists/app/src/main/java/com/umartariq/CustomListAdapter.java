package com.umartariq;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//ISO2 (Alpha2) Country codes : total 254 , static file , map flag img to country name from resources.

public class CustomListAdapter extends ArrayAdapter<String> {

    private Context mContext; //variable for app context

    public CustomListAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull String[] objects) {

        super(context, resource, textViewResourceId, objects);
        this.mContext = context;//set app context value from constructor for second activity called through intent in first activity.
    }


    //the getView method allows us to modify what we put in the list.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.custom_list,parent,false);
        String[] items = mContext.getResources().getStringArray(R.array.country_data); // don't pass context in other classes due to memory leaks
        ImageView countryFlagImageView = (ImageView) row.findViewById(R.id.countryFlagImageView);
        TextView countryNameTextView = (TextView) row.findViewById(R.id.countryNameTextView);
        countryNameTextView.setText(items[position]);

        if(items[position].contains("United States Of America")){
            countryFlagImageView.setImageResource(R.drawable.us);
        }
        else if(items[position].contains("Finland")){
            countryFlagImageView.setImageResource(R.drawable.fi);
        }
        else if(items[position].contains("Italy")){
            countryFlagImageView.setImageResource(R.drawable.it);
        }
        else if(items[position].contains("Pakistan")){
            countryFlagImageView.setImageResource(R.drawable.pk);
        }
        else if(items[position].contains("Saudi Arabia")){
            countryFlagImageView.setImageResource(R.drawable.sa);
        }
        else if(items[position].contains("Turkey")){
            countryFlagImageView.setImageResource(R.drawable.tr);
        }
        else if(items[position].contains("Russia")){
            countryFlagImageView.setImageResource(R.drawable.ru);
        }
        else if(items[position].contains("Afghanistan")){
            countryFlagImageView.setImageResource(R.drawable.af);
        }
        else if(items[position].contains("Argentina")){
            countryFlagImageView.setImageResource(R.drawable.ar);
        }
        else if(items[position].contains("Australia")){
            countryFlagImageView.setImageResource(R.drawable.au);
        }
        else if(items[position].contains("Brazil")){
            countryFlagImageView.setImageResource(R.drawable.br);
        }
        else if(items[position].contains("Canada")){
            countryFlagImageView.setImageResource(R.drawable.ca);
        }
        else if(items[position].contains("Denmark")){
            countryFlagImageView.setImageResource(R.drawable.dk);
        }
        else if(items[position].contains("Egypt")){
            countryFlagImageView.setImageResource(R.drawable.eg);
        }
        else if(items[position].contains("France")){
            countryFlagImageView.setImageResource(R.drawable.fr);
        }else if(items[position].contains("Germany")){
            countryFlagImageView.setImageResource(R.drawable.de);
        }else if(items[position].contains("Mexico")){
            countryFlagImageView.setImageResource(R.drawable.mx);
        }else if(items[position].contains("Netherlands")){
            countryFlagImageView.setImageResource(R.drawable.nl);
        }else if(items[position].contains("New Zealand")){
            countryFlagImageView.setImageResource(R.drawable.nz);
        }else if(items[position].contains("Pakistan")){
            countryFlagImageView.setImageResource(R.drawable.pk);
        }
else if(items[position].contains("Palestine")){
            countryFlagImageView.setImageResource(R.drawable.ps);
        }else if(items[position].contains("Qatar")){
            countryFlagImageView.setImageResource(R.drawable.qa);
        }else if(items[position].contains("Singapore")){
            countryFlagImageView.setImageResource(R.drawable.sg);
        }else if(items[position].contains("South Africa")){
            countryFlagImageView.setImageResource(R.drawable.za);
        }else if(items[position].contains("Sweden")){
            countryFlagImageView.setImageResource(R.drawable.se);
        }else if(items[position].contains("Syria")){
            countryFlagImageView.setImageResource(R.drawable.sy);
        }else if(items[position].contains("Japan")){
            countryFlagImageView.setImageResource(R.drawable.jp);
        }else if(items[position].contains("North Korea")){
            countryFlagImageView.setImageResource(R.drawable.kp);
        }else if(items[position].contains("South Korea")){
            countryFlagImageView.setImageResource(R.drawable.kr);
        }else if(items[position].contains("Kuwait")){
            countryFlagImageView.setImageResource(R.drawable.kw);
        }else if(items[position].contains("Taiwan")){
            countryFlagImageView.setImageResource(R.drawable.tw);
        }else if(items[position].contains("United Kingdom")){
            countryFlagImageView.setImageResource(R.drawable.gb);
        }



        return row;
    }

}



