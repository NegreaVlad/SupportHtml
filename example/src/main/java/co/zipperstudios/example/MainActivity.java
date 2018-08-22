package co.zipperstudios.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;

import co.zipperstudios.supporthtml.SupportHtml;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String html = "<p><b>b </b><i><b>bi </b></i><i><b><u>biu</u></b></i></p>";

        Spanned formattedHtml;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            formattedHtml = Html.fromHtml(html, Html.TO_HTML_PARAGRAPH_LINES_INDIVIDUAL);
        } else {
            formattedHtml = SupportHtml.fromHtml(html, SupportHtml.TO_HTML_PARAGRAPH_LINES_INDIVIDUAL);
        }
    }
}
