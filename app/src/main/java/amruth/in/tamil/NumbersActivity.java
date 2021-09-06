package amruth.in.tamil;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "Ondru", R.drawable.number_one));
        words.add(new Word("two", "Irandu", R.drawable.number_two));
        words.add(new Word("three", "Mundru", R.drawable.number_three));
        words.add(new Word("four", "Naanku", R.drawable.number_four));
        words.add(new Word("five", "Aindhu", R.drawable.number_five));
        words.add(new Word("six", "Aru", R.drawable.number_six));
        words.add(new Word("seven", "Elu", R.drawable.number_seven));
        words.add(new Word("eight", "Ettu", R.drawable.number_eight));
        words.add(new Word("nine", "Onpadhu", R.drawable.number_nine));
        words.add(new Word("ten", "Pathu", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
