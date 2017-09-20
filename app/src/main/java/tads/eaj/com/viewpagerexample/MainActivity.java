package tads.eaj.com.viewpagerexample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


/*
 I do not own the copyrights of the images used in this project. The images are used only for educational purpose.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new PersonagemAdapter(this, Personagem.getListaPersonagem()));
        viewPager.addOnPageChangeListener(meulistener);
        //viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
    }

    private ViewPager.OnPageChangeListener meulistener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            Log.i("AULA17", "onPageScrolled chamado, posição: "+position);
        }

        @Override
        public void onPageSelected(int position) {
            Log.i("AULA17", "onPageSelected chamado, posição: "+position);
            Toast.makeText(MainActivity.this, "Posição: "+ position, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onPageScrollStateChanged(int state) {
            Log.i("AULA17", "onPageScrollStateChanged");
        }
    };
}
