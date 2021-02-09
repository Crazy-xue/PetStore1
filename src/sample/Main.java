package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.w3c.dom.Text;

public class Main extends Application {
    boolean disBool = true;
    boolean seaBool1 = true;
    boolean seaBool2 = true;
    boolean seaBool3 = true;
    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(25,25,25,25));

        Label Title1 = new Label("UAR components names:");
        grid.add(Title1,0,0);

        Label Title2 = new Label("UAR components description:");
        grid.add(Title2,4,0);

        Label title1 = new Label("1.UAR Identifier");
        grid.add(title1,0,1,4,1);

        Label title2 = new Label("2.Succinct Descripetion of the Usability Aspect");
        grid.add(title2,0,2,4,1);

        Label title3 = new Label("3.Evidence for the Aspect");
        grid.add(title3,0,3,4,1);

        Label title4 = new Label("4.Explanation of the Aspect");
        grid.add(title4,0,4,4,1);

        Label title5 = new Label("5.Severity of the Problem or Benefit of the Good Feature");
        grid.add(title5,0,5,4,1);

        Label title6 = new Label("6.Possible Solutions and Potential Trade-offs");
        grid.add(title6,0,6,4,1);

        Label title7 = new Label("7.Relationship to Other Usability Aspects");
        grid.add(title7,0,7,4,1);


        TextArea description = new TextArea();
        description.setEditable(false);
        description.setWrapText(true);
        description.setOpacity(0.5);
        grid.add(description,4,1,5,8);

        Label FoundAt = new Label("Fount at:");
        grid.add(FoundAt,4,9);

        Label EnterNum = new Label("Enter a number:");
        grid.add(EnterNum,0,10,1,1);

        TextField NumLabel = new TextField();
        grid.add(NumLabel,1,10,2,1);

        Button Display = new Button("Display");
        grid.add(Display,3,10,1,1);

        Display.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        String numText = NumLabel.getText();
                        if(!numText.isEmpty()) {
                            description.clear();
                            if (Character.isDigit(numText.charAt(0))) {
                                int num = Integer.parseInt(NumLabel.getText());
                                if (num >= 1 && num <= 7) {
                                    switch (num) {
                                        case 1:
                                            description.setText("This should be a unique identifier " +
                                                    "for the purposes of filing. If more than" +
                                                    " one person is working on the project or " +
                                                    "more than one analysis technique is being" +
                                                    " used, this identifier could contain letters" +
                                                    " and numbers. For example, if Chris Smith and" +
                                                    " Jan Koo are both doing an analysis, the " +
                                                    "identifier might be CS1 or JK75. If both a " +
                                                    "heuristic evaluation and a think-aloud usability" +
                                                    " study were used, the identifiers might be HE6 or" +
                                                    " TA89. Follow the unique identifier with the word " +
                                                    "'Problem,' if the report pertains to a usability problem" +
                                                    " of the interface, or the words 'Good Feature,' " +
                                                    "if it describes an aspect of the interface you " +
                                                    "feel should be preserved in any redesign.");
                                            break;
                                        case 2:
                                            description.setText("This description will be used as the 'name' " +
                                                    "of this UAR when you talk about its relation to other UARs." +
                                                    " Make the name as short as possible (about three to five" +
                                                    " words) but still descriptive and distinguishable from other " +
                                                    "aspects of the system. If this UAR is about a problem (as" +
                                                    " opposed to a good feature), make sure you have a name that " +
                                                    "describes the problem, rather than a solution.");
                                            break;
                                        case 3:
                                            description.setText("This is the objective supporting material that" +
                                                    " justifies your identifying the aspect as worthy of report. " +
                                                    "This section needs to contain enough information for a reader " +
                                                    "of this UAR to understand what triggered the report. For an " +
                                                    "HE report, for instance, this could be an image of a cluttered" +
                                                    " screen and the heuristic about aesthetics and minimalist design." +
                                                    " In a think-aloud study this is usually what was on the screen" +
                                                    " (a screen shot or description), what the user did (keystrokes, " +
                                                    "mouse movements), what the system did in response to any user a" +
                                                    "ctions, and what the user said. You need to include enough pertinent " +
                                                    "information about the identification of an aspect for the reader " +
                                                    "to understand what the analyst was thinking when the aspect was " +
                                                    "identified (for HE) or what the user was trying to do when the aspect " +
                                                    "either hindered or facilitated his or her progress.");
                                            break;
                                        case 4:
                                            description.setText("This is your interpretation of the evidence. That is, " +
                                                    "for a think-aloud usability test, why you think what happened happened, " +
                                                    "or, for an HE, why you think the aspect was designed the way it was." +
                                                    " You need to provide enough content in this explanation for the reader" +
                                                    " to understand the problem-even if they do not know the system or domain" +
                                                    " as well as you do.");
                                            break;
                                        case 5:
                                            description.setText("This is your reasoning about how important it is to either" +
                                                    " fix this problem or preserve this good feature. This includes how" +
                                                    " frequently the users will experience this aspect, whether they are likely " +
                                                    "to learn how it works, whether it will affect new users, casual users, " +
                                                    "experienced users, etc.");
                                            break;
                                        case 6:
                                            description.setText("If this aspect is a problem (as opposed to a good feature " +
                                                    "to be preserved in the next version of the software), this is the place to " +
                                                    "propose a solution. It is not necessary to have a solution as soon as you" +
                                                    " identify a problem-you might find after analyzing the whole interface that " +
                                                    "many problems are related and can all be fixed by making a single broad change" +
                                                    " instead of making several small changes. However, if you do propose a possible" +
                                                    " solution, report any potential design trade-offs that you see");
                                            break;
                                        case 7:
                                            description.setText("It is often the case that UARs are related to each other. This is" +
                                                    " where you record which UARs this one is related to and a statement about " +
                                                    "how it is related. Make sure that all the related UARs point to each other." +
                                                    " It is a common mistake to enter the pointer into a newly created UAR, but " +
                                                    "neglect to go back to the previous ones that it relates to and update their UARs.");
                                            break;
                                    }
                                } else {
                                    if (disBool) {
                                        disBool = false;
                                        Display display = new Display();
                                        display.BtnOk.addEventHandler(MouseEvent.MOUSE_PRESSED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        display.primaryStage.close();
                                                        disBool = true;
                                                    }
                                                });
                                    }
                                }
                            }else{
                                if (disBool) {
                                    disBool = false;
                                    Display display = new Display();
                                    display.BtnOk.addEventHandler(MouseEvent.MOUSE_PRESSED,
                                            new EventHandler<MouseEvent>() {
                                                @Override
                                                public void handle(MouseEvent event) {
                                                    display.primaryStage.close();
                                                    disBool = true;
                                                }
                                            });
                                }
                            }
                        }
                        else{
                            if(disBool) {
                                disBool = false;
                                Display display = new Display();
                                display.BtnOk.addEventHandler(MouseEvent.MOUSE_PRESSED,
                                        new EventHandler<MouseEvent>() {
                                            @Override
                                            public void handle(MouseEvent event) {
                                                display.primaryStage.close();
                                                disBool = true;
                                            }
                                        });
                            }
                        }
                    }
                });
        Label EnterString = new Label("Enter a search string:");
        grid.add(EnterString,0,11,1,1);

        TextField SearchLabel = new TextField();
        grid.add(SearchLabel,1,11,2,1);

        Button Search = new Button("Search");
        grid.add(Search,3,11,1,1);

        final Label[] FirstOccur = {new Label()};
        grid.add(FirstOccur[0],4,10);
        Label LastOccur = new Label();
        grid.add(LastOccur,4,11);

        Search.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        if(!description.getText().isEmpty()) {
                            String searchStr = SearchLabel.getText();
                            if(!searchStr.isEmpty()) {
                                int index = 0;
                                int count = 0;//统计关键字出现的次数；
                                String desStr = description.getText();
                                    int firstIndex = desStr.indexOf(searchStr)+1;
                                    int lastIndex = desStr.lastIndexOf(searchStr)+1;
                                    while ((index = desStr.indexOf(searchStr)) != -1) {
                                        desStr = desStr.substring(index + searchStr.length());
                                        count++;
                                    }
                                    if(seaBool3) {
                                        seaBool3 = false;
                                        SearchString3 search = new SearchString3();
                                        search.count = new Label("The number of occurences of '"+searchStr+"' is:"+count);
                                        search.count.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
                                        search.grid.add(search.count,0,0,2,1);

                                        search.BtnYes.addEventHandler(MouseEvent.MOUSE_PRESSED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        search.primaryStage.close();
                                                        seaBool3 = true;
                                                    }
                                                });
                                        search.BtnNo.addEventHandler(MouseEvent.MOUSE_PRESSED,
                                                new EventHandler<MouseEvent>() {
                                                    @Override
                                                    public void handle(MouseEvent event) {
                                                        search.primaryStage.close();
                                                        description.clear();
                                                        NumLabel.clear();
                                                        SearchLabel.clear();
                                                        seaBool3 = true;
                                                    }
                                                });
                                    }
                                    FirstOccur[0] = new Label("Occurrence 1: Position: "+firstIndex);
                                    grid.add(FirstOccur[0],4,10);
                                    Label LastOccur = new Label("Occurrence "+count+": Position: "+lastIndex);
                                    grid.add(LastOccur,4,11);
                                    System.out.println(count);
                                    System.out.println(firstIndex);
                                    System.out.println(lastIndex);
                            }else{
                                if(seaBool2) {
                                    seaBool2 = false;
                                    SearchString2 search = new SearchString2();
                                    search.BtnOk.addEventHandler(MouseEvent.MOUSE_PRESSED,
                                            new EventHandler<MouseEvent>() {
                                                @Override
                                                public void handle(MouseEvent event) {
                                                    search.primaryStage.close();
                                                    seaBool2 = true;
                                                }
                                            });
                                }
                            }
                        }
                        else{
                            if(seaBool1) {
                                seaBool1 = false;
                                SearchString1 search = new SearchString1();
                                search.BtnOk.addEventHandler(MouseEvent.MOUSE_PRESSED,
                                        new EventHandler<MouseEvent>() {
                                            @Override
                                            public void handle(MouseEvent event) {
                                                search.primaryStage.close();
                                                seaBool1 = true;
                                            }
                                        });
                            }
                        }
                    }
                });

        Button Exit = new Button("Exit");
        grid.add(Exit,6,13,2,1);

        Exit.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        primaryStage.close();
                    }
                });
        Scene scene = new Scene(grid,800,400);
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.setTitle("UAR Componetns");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
class Display{
    Stage primaryStage = new Stage();
    GridPane grid = new GridPane();
    Button BtnOk = new Button("确定");
    Display() {
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(25,25,25,25));

        Label remind = new Label("Please enter values between 1 and 7");
        remind.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        grid.add(remind,0,0,1,2);

        HBox hbbtnOk = new HBox(10);
        hbbtnOk.setAlignment(Pos.CENTER);
        hbbtnOk.getChildren().add(BtnOk);
        grid.add(hbbtnOk, 0, 2);

        Scene scene = new Scene(grid,300,100);
        primaryStage.setTitle("Search String");
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
class SearchString1{
    Stage primaryStage = new Stage();
    GridPane grid = new GridPane();
    Button BtnOk = new Button("确定");
    SearchString1() {
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(25,25,25,25));

        Label remind = new Label("Please select text");
        remind.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        grid.add(remind,0,0);

        HBox hbbtnOk = new HBox(10);
        hbbtnOk.setAlignment(Pos.CENTER);
        hbbtnOk.getChildren().add(BtnOk);
        grid.add(hbbtnOk, 0, 2);

        Scene scene = new Scene(grid,300,100);
        primaryStage.setTitle("Search String");
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
class SearchString2{
    Stage primaryStage = new Stage();
    GridPane grid = new GridPane();
    Button BtnOk = new Button("确定");
    SearchString2() {
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(25,25,25,25));

        Label remind = new Label("Please enter a search string");
        remind.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        grid.add(remind,0,0);

        HBox hbbtnOk = new HBox(10);
        hbbtnOk.setAlignment(Pos.CENTER);
        hbbtnOk.getChildren().add(BtnOk);
        grid.add(hbbtnOk, 0, 2);

        Scene scene = new Scene(grid,300,100);
        primaryStage.setTitle("Search String");
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
class SearchString3{
    Stage primaryStage = new Stage();
    GridPane grid = new GridPane();
    Button BtnYes = new Button("是");
    Button BtnNo = new Button("否");

    Label count;
    SearchString3() {
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(25,25,25,25));
//        count = new Label("The number of occurences of is:");
        Label ask = new Label("Search same text?");
//        count.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        ask.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));

//        grid.add(count,0,0,2,1);
        grid.add(ask,0,1,2,1);
        grid.add(BtnYes,0,2);
        grid.add(BtnNo,1,2);
        Scene scene = new Scene(grid,300,100);
        primaryStage.setTitle("Search String");
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
