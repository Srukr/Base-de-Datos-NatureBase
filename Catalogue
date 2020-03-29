package com.example.naturebasestringparameter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Catalogue extends AppCompatActivity {

    //We use this variable to close this activity through the intent
    final Activity activity = this;

    private EditText et1;
    private ListView lv1;
    private ArrayAdapter<String> adapter;

    //Vector con las plantas
    String plants[] = {"Arrowhead", "Bald Hip Rose", "Beach Strawberry", "Beaked Hazelnut", "Bearberry",
            "Big Tuna Pine", "Bigleaf Maple",

            "Bitter Cherry", "Black Cap Raspberry", "Black Cottonwood", "Black Gooseberry", "Black Hawthorn",
            "Blackberry", "Bleeding Heart",

            "Blue Elderberry", "Blue Eyed Grass", "Bog Laurel", "Bog Rosemary", "Boxwood",
            "Broadleaved Stonecrop", "Bunchberry", "Camas Common",

            "Camas Great", "Cascade penstemon", "Cascara", "Cattail", "Chocolate Lily",
            "coastal gumweed", "Colorado Spruce", "Columbia Lewisia",

            "Cooley's Hedge Nettle", "Cow Parsnip", "Dagger Leaved Rush", "Devils Club", "Deweys Sedge",
            "Douglas Aster", "Douglas Fir",

            "Douglas' Maple", "Dunegrass", "Dwarf Japanese Pine", "Eounonymous (Golden Edge)",
            "Eounonymous (Moonshadow)", "Eounonymous (SilverQueen)",

            "False Lily of The Valley", "False Solomons Seal", "Farewell to Spring", "Fern", "Fern (Lady)",
            "Fern (Licorice)", "Fern (Normal)",

            "Fern (Oak)", "Fern (Sword)", "Fireweed", "Flowered Alumroot", "Foam Flower",
            "Fringecup", "Garry Oak",

            "Goats Beard", "Golden Eyed Grass", "Golden Rod", "Golden Spanish Pin Fir", "Graceful Cinquefoil",
            "Grand fir", "Green Spire", "Hairy Honeysuckle", "Hairy Manzanita", "Hardstem Bulrush",

            "Harebell", "Hendersons Checker Mallow","highbush cranberry; mooseberry", "Hinoki Cypress", "Honeysuckle (Orange)", "Hookers Onion",
            "Hookers Willow", "Huckleberry",

            "Hydrangea", "Idaho Fecue", "Indian Plum", "Insideout Flower", "Juniperus",
            "Kinnick Kinnick", "Kneeling Angelica",

            "Low Oregon Grape", "Lyngbye's Sedge", "Madrone / Madrona", "Maidenhair Fern", "Manzanita (Hybrid)",
            "Mock Orange", "Mogo Pine",

            "Mooseberry", "Nettle", "Nodding Onion", "Nootka Rose", "Oceanspray",
            "Oregon Ash", "Oregon Box",

            "Oregon Grape", "Oregon Iris", "Oregon White Oak", "Oxalis", "Pacific Crabapple",
            "Pacific Dogwood",  "Pacific Ninebark", "Pacific Rhododendron", "Pacific Waterleaf",
            "Pacific Wax Myrtle", "Pacific Willow", "Palace Purple", "Palmate Colsfoot",

            "Paper Birch", "Pear", "Peraly Everlasting", "Picea", "Piggyback Plant", "Quaking Aspen",
            "Rattlesnake Plantain", "Red Alder", "Red Elderberry", "Red Flowering Currant",
            "Red Huckleberry", "Red Osier Dogwood", "Red Stem Ceanothus", "Salal",
            "Salmonberry", "Scoulers Corydalis", "Sea Pink", "Seawatch", "Serviceberry",

            "Shore Pine", "Showy Fleabane", "Silverweed", "Sitka Spruce", "Sitka Willow",
            "Skunk Cabbage", "Slide Alder", "Slough Sedge", "Small Bulrush",
            "Snowberry", "Snowberry (Trailing)", "Snowbrush", "Spiraea", "Spreading Stonecrop",
            "Star Flowered False Solomons Seal", "Sticky Laurel", "Stink Currant",
            "Strawberry", "Stream Violet", "Subalpine Spiraea", "Swamp Lantern", "Swamp Rose",
            "Sweet Gale", "Thick Headed Sedge", "Thimbleberry", "Thistle",

            "Tilia", "Trillium", "Tufted Hairgrass", "Twinberry", "Twinflower", "Vanilla Leaf",
            "Vine Maple", "Western Columbine", "Western Hemlock", "Western Redcedar",
            "Western Starflower", "Western White Pine", "White Spiraea", "Wild Ginger", "Wild Strawberry",
            "Yarrow", "Yellow Monkey Flower", "Yew"};

    //Vector con los ID de cada planta
    int ides[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
            41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
            61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
            81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101,
            102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
            121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140,
            141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160,
            161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);

        //Show logo on ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        et1 = (EditText)findViewById(R.id.et_filter);
        lv1 = (ListView)findViewById(R.id.PlantList);

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, plants);
        lv1.setAdapter(adapter);


        //Filter the Text
        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //When clicking on an item from a ListView
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get text from the list and send it to plantview
                String ide = lv1.getItemAtPosition(position).toString();
                Intent intent = new Intent(Catalogue.this, PlantView.class);
                intent.putExtra("IDf", ide);
                startActivity(intent);
                activity.finish();
            }
        });

    }

    //Disable back button
    @Override
    public void onBackPressed(){

    }

    //Go back
    public void GoBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}
