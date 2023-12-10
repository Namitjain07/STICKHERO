package com.example.stckhero;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class gallary_screen_controller {
    @FXML
    private Button crossButton;
    @FXML
    private Text label;
    @FXML
    private ImageView titleImageView;
    @FXML
    private ImageView titleImageView2;
    @FXML
    private ImageView selectback1;
    @FXML
    private ImageView selectback2;
    @FXML
    private ImageView selectback3;
    @FXML
    private ImageView selectback4;
    @FXML
    private ImageView selectback5;
    @FXML
    private ImageView selectback6;
    @FXML
    private ImageView selectback7;
    @FXML
    private ImageView selectback8;
    @FXML
    private ImageView selectback9;

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;


    public void initialize() {
        Image titleImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background1.png")));
        titleImageView.setImage(titleImage);

        Image titleImage2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Rectangle 38.png")));
        titleImageView2.setImage(titleImage2);
        Image selectbackg1 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("orange_dark.png")));
        selectback1.setImage(selectbackg1);
        Image selectbackg2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("orange_light.png")));
        selectback2.setImage(selectbackg2);
        Image selectbackg3 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("orange_light.png")));
        selectback3.setImage(selectbackg3);
        Image selectbackg4 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("orange_light.png")));
        selectback4.setImage(selectbackg4);
        Image selectbackg5 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("orange_light.png")));
        selectback5.setImage(selectbackg5);
        Image selectbackg6 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("orange_light.png")));
        selectback6.setImage(selectbackg6);
        Image selectbackg7 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("orange_light.png")));
        selectback7.setImage(selectbackg7);
        Image selectbackg8 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("orange_light.png")));
        selectback8.setImage(selectbackg8);
        Image selectbackg9 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("orange_light.png")));
        selectback9.setImage(selectbackg9);

        Image crossbuttonImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("cross.png")));
        ImageView crossimageView = new ImageView(crossbuttonImage);
        crossButton.setGraphic(crossimageView);
        label.setText("SELECT BACKGROUND");


        Image buttonImage1 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background1 (Custom).png")));
        ImageView imageView1 = new ImageView(buttonImage1);
        btn1.setGraphic(imageView1);

        Image buttonImage2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background2 (Custom).png")));
        ImageView imageView2 = new ImageView(buttonImage2);
        btn2.setGraphic(imageView2);

        Image buttonImage3 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background3 (Custom).png")));
        ImageView imageView3 = new ImageView(buttonImage3);
        btn3.setGraphic(imageView3);

        Image buttonImage4 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background4 (Custom).png")));
        ImageView imageView4 = new ImageView(buttonImage4);
        btn4.setGraphic(imageView4);

        Image buttonImage5 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background5 (Custom).png")));
        ImageView imageView5= new ImageView(buttonImage5);
        btn5.setGraphic(imageView5);

        Image buttonImage6 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background6 (Custom).png")));
        ImageView imageView6 = new ImageView(buttonImage6);
        btn6.setGraphic(imageView6);

        Image buttonImage7 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background7 (Custom).png")));
        ImageView imageView7 = new ImageView(buttonImage7);
        btn7.setGraphic(imageView7);

        Image buttonImage8 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background8 (Custom).png")));
        ImageView imageView8 = new ImageView(buttonImage8);
        btn8.setGraphic(imageView8);

        Image buttonImage9 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("background9 (Custom).png")));
        ImageView imageView9 = new ImageView(buttonImage9);
        btn9.setGraphic(imageView9);




    }

    @FXML
    protected  void onCrossButtonClick() throws IOException{
        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene3 = new Scene(fxmlLoader1.load(), 800, 800);
//        Stage str= HelloApplication.primaryStage;
        Stage rdf2 = HelloApplication.primaryStage;
        rdf2.setScene(scene3);
        System.out.println("cross button clicked");
    }

    @FXML
    protected void onButton1Click(){
        HelloApplication.init_stick_hero.background_no=1;
        Image selectbackg11 = new Image(getClass().getResourceAsStream("orange_dark.png"));
        Image selectbackg12 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg13 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg14 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg15 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg16 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg17 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg18 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg19 = new Image(getClass().getResourceAsStream("orange_light.png"));
        selectback1.setImage(selectbackg11);
        selectback2.setImage(selectbackg12);
        selectback3.setImage(selectbackg13);
        selectback4.setImage(selectbackg14);
        selectback5.setImage(selectbackg15);
        selectback6.setImage(selectbackg16);
        selectback7.setImage(selectbackg17);
        selectback8.setImage(selectbackg18);
        selectback9.setImage(selectbackg19);
    }

    @FXML
    protected void onButton2Click(){
        HelloApplication.init_stick_hero.background_no=2;
        Image selectbackg11 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg12 = new Image(getClass().getResourceAsStream("orange_dark.png"));
        Image selectbackg13 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg14 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg15 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg16 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg17 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg18 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg19 = new Image(getClass().getResourceAsStream("orange_light.png"));
        selectback1.setImage(selectbackg11);
        selectback2.setImage(selectbackg12);
        selectback3.setImage(selectbackg13);
        selectback4.setImage(selectbackg14);
        selectback5.setImage(selectbackg15);
        selectback6.setImage(selectbackg16);
        selectback7.setImage(selectbackg17);
        selectback8.setImage(selectbackg18);
        selectback9.setImage(selectbackg19);
    }

    @FXML
    protected void onButton3Click(){
        HelloApplication.init_stick_hero.background_no=3;
        Image selectbackg11 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg12 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg13 = new Image(getClass().getResourceAsStream("orange_dark.png"));
        Image selectbackg14 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg15 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg16 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg17 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg18 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg19 = new Image(getClass().getResourceAsStream("orange_light.png"));
        selectback1.setImage(selectbackg11);
        selectback2.setImage(selectbackg12);
        selectback3.setImage(selectbackg13);
        selectback4.setImage(selectbackg14);
        selectback5.setImage(selectbackg15);
        selectback6.setImage(selectbackg16);
        selectback7.setImage(selectbackg17);
        selectback8.setImage(selectbackg18);
        selectback9.setImage(selectbackg19);
    }

    @FXML
    protected void onButton4Click(){
        HelloApplication.init_stick_hero.background_no=4;
        Image selectbackg11 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg12 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg13 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg14 = new Image(getClass().getResourceAsStream("orange_dark.png"));
        Image selectbackg15 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg16 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg17 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg18 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg19 = new Image(getClass().getResourceAsStream("orange_light.png"));
        selectback1.setImage(selectbackg11);
        selectback2.setImage(selectbackg12);
        selectback3.setImage(selectbackg13);
        selectback4.setImage(selectbackg14);
        selectback5.setImage(selectbackg15);
        selectback6.setImage(selectbackg16);
        selectback7.setImage(selectbackg17);
        selectback8.setImage(selectbackg18);
        selectback9.setImage(selectbackg19);
    }
    @FXML
    protected void onButton5Click(){
        HelloApplication.init_stick_hero.background_no=5;
        Image selectbackg11 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg12 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg13 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg14 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg15 = new Image(getClass().getResourceAsStream("orange_dark.png"));
        Image selectbackg16 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg17 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg18 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg19 = new Image(getClass().getResourceAsStream("orange_light.png"));
        selectback1.setImage(selectbackg11);
        selectback2.setImage(selectbackg12);
        selectback3.setImage(selectbackg13);
        selectback4.setImage(selectbackg14);
        selectback5.setImage(selectbackg15);
        selectback6.setImage(selectbackg16);
        selectback7.setImage(selectbackg17);
        selectback8.setImage(selectbackg18);
        selectback9.setImage(selectbackg19);
    }
    @FXML
    protected void onButton6Click(){
        HelloApplication.init_stick_hero.background_no=6;
        Image selectbackg11 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg12 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg13 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg14 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg15 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg16 = new Image(getClass().getResourceAsStream("orange_dark.png"));
        Image selectbackg17 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg18 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg19 = new Image(getClass().getResourceAsStream("orange_light.png"));
        selectback1.setImage(selectbackg11);
        selectback2.setImage(selectbackg12);
        selectback3.setImage(selectbackg13);
        selectback4.setImage(selectbackg14);
        selectback5.setImage(selectbackg15);
        selectback6.setImage(selectbackg16);
        selectback7.setImage(selectbackg17);
        selectback8.setImage(selectbackg18);
        selectback9.setImage(selectbackg19);
    }

    @FXML
    protected void onButton7Click(){
        HelloApplication.init_stick_hero.background_no=7;
        Image selectbackg11 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg12 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg13 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg14 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg15 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg16 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg17 = new Image(getClass().getResourceAsStream("orange_dark.png"));
        Image selectbackg18 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg19 = new Image(getClass().getResourceAsStream("orange_light.png"));
        selectback1.setImage(selectbackg11);
        selectback2.setImage(selectbackg12);
        selectback3.setImage(selectbackg13);
        selectback4.setImage(selectbackg14);
        selectback5.setImage(selectbackg15);
        selectback6.setImage(selectbackg16);
        selectback7.setImage(selectbackg17);
        selectback8.setImage(selectbackg18);
        selectback9.setImage(selectbackg19);
    }
    @FXML
    protected void onButton8Click(){
        HelloApplication.init_stick_hero.background_no=8;
        Image selectbackg11 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg12 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg13 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg14 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg15 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg16 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg17 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg18 = new Image(getClass().getResourceAsStream("orange_dark.png"));
        Image selectbackg19 = new Image(getClass().getResourceAsStream("orange_light.png"));
        selectback1.setImage(selectbackg11);
        selectback2.setImage(selectbackg12);
        selectback3.setImage(selectbackg13);
        selectback4.setImage(selectbackg14);
        selectback5.setImage(selectbackg15);
        selectback6.setImage(selectbackg16);
        selectback7.setImage(selectbackg17);
        selectback8.setImage(selectbackg18);
        selectback9.setImage(selectbackg19);
    }

    @FXML
    protected void onButton9Click(){
        HelloApplication.init_stick_hero.background_no=9;
        Image selectbackg11 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg12 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg13 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg14 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg15 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg16 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg17 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg18 = new Image(getClass().getResourceAsStream("orange_light.png"));
        Image selectbackg19 = new Image(getClass().getResourceAsStream("orange_dark.png"));
        selectback1.setImage(selectbackg11);
        selectback2.setImage(selectbackg12);
        selectback3.setImage(selectbackg13);
        selectback4.setImage(selectbackg14);
        selectback5.setImage(selectbackg15);
        selectback6.setImage(selectbackg16);
        selectback7.setImage(selectbackg17);
        selectback8.setImage(selectbackg18);
        selectback9.setImage(selectbackg19);
    }

}
