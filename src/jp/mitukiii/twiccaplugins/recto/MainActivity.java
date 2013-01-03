package jp.mitukiii.twiccaplugins.recto;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity
{
  private static final String RECTO_URL = "http://rec.to/";

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    Intent intent = getIntent();
    String screenName = intent.getStringExtra(Intent.EXTRA_TEXT);
    Intent sendIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(RECTO_URL + screenName));
    startActivity(sendIntent);
    finish();
  }
}
