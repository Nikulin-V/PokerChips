package nikulin.pokerchips;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class IntroductionActivity extends PokerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Button newGameButton = findViewById(R.id.newGameButton);
        Button connectButton = findViewById(R.id.connectButton);

        newGameButton.setOnClickListener(
                view -> {
                    Intent intent = new Intent(IntroductionActivity.this, NewGameActivity.class);
                    IntroductionActivity.this.startActivity(intent);
                }
        );

        connectButton.setOnClickListener(
                view -> {
                    Intent intent = new Intent(IntroductionActivity.this, ConnectActivity.class);
                    IntroductionActivity.this.startActivity(intent);
                }
        );
    }
}