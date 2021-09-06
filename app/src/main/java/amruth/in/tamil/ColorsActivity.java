package amruth.in.tamil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "Sivappu", R.drawable.red));
        words.add(new Word("orange", "Arangu", R.drawable.orange));
        words.add(new Word("yellow", "manjal", R.drawable.yellow));
        words.add(new Word("green", "pachai", R.drawable.green));
        words.add(new Word("blue", "Neelam", R.drawable.blue));
        words.add(new Word("purple", "Oodha", R.drawable.purple));
        words.add(new Word("brown", "Palappu", R.drawable.brown));
        words.add(new Word("white", "vellai", R.drawable.white));
        words.add(new Word("gray", "Saambal", R.drawable.gray));
        words.add(new Word("black", "karuppu", R.drawable.black));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
