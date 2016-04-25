import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;


public class Calculator extends Application{
	@Override
	public void start(Stage primaryStage){
	FlowPane pane = new FlowPane();
	pane.setPadding(new Insets(20,20,20,20));
	//set spacing
	pane.setHgap(10);
	pane.setVgap(10);
	//Create the buton
	Button MC = new Button("MC");
	MC.setPrefSize(60,40);
	
	Button MR = new Button("MR");
	MR.setPrefSize(60,40);
	
	Button MS = new Button("MS");
	MS.setPrefSize(60,40);
	
	Button MADD = new Button("M+");
	MADD.setPrefSize(60,40);
	
	Button MSUB = new Button("M-");
	MSUB.setPrefSize(60,40);
	
	Button BACK = new Button("BACK");
	BACK.setPrefSize(60,40);
	
	Button CE = new Button("CE");
	CE.setPrefSize(60,40);
	
	Button C = new Button("C");
	C.setPrefSize(60,40);
	
	Button AP = new Button("+/-");
	AP.setPrefSize(60,40);
	
	Button SQRT = new Button("กิ");
	SQRT.setPrefSize(60,40);
	
	Button M7 = new Button("7");
	M7.setPrefSize(60,40);
	
	Button M8 = new Button("8");
	M8.setPrefSize(60,40);
	
	Button M9 = new Button("9");
	M9.setPrefSize(60,40);
	
	Button DIV = new Button("/");
	DIV.setPrefSize(60,40);
	
	Button PER = new Button("%");
	PER.setPrefSize(60,40);
	
	Button M4 = new Button("4");
	M4.setPrefSize(60,40);
	
	Button M5 = new Button("5");
	M5.setPrefSize(60,40);
	
	Button M6 = new Button("6");
	M6.setPrefSize(60,40);
	
	Button MUL = new Button("*");
	MUL.setPrefSize(60,40);
	
	Button REC = new Button("1/X");
	REC.setPrefSize(60,40);
	
	Button M1 = new Button("1");
	M1.setPrefSize(60,40);

	Button M2 = new Button("2");
	M2.setPrefSize(60,40);
	
	Button M3 = new Button("3");
	M3.setPrefSize(60,40);

	Button EQU = new Button("=");
	EQU.setPrefSize(60,40);
	EQU.setPrefSize(60,90);
	EQU.setLayoutX(330);
	EQU.setLayoutY(300);
	
	Button M0 = new Button("0");
	M0.setPrefSize(130,40);
	
	Button DOT = new Button(".");
	DOT.setPrefSize(60,40);
	
	Button SUB = new Button("-");
	SUB.setPrefSize(60,40);
	
	Button PLU = new Button("+");
	PLU.setPrefSize(60,40);
	
	//Create the TextField
	TextField space = new TextField();
	space.setPrefSize(340,40);
	space.setEditable(false);
	pane.getChildren().add(space);
	
	//Set the Button
	pane.getChildren().addAll(
		MC,    MR,    MS,    MADD,  MSUB,
		BACK,  CE,    C,     AP,    SQRT,
		M7,    M8,    M9,    DIV,   PER,
		M4,    M5,    M6,    MUL,   REC,
		M1,    M2,    M3,    SUB,   
		M0,    DOT,   PLU
	);
	
	
	//Create a Scene
	Scene scene = new Scene(pane);
	primaryStage.setTitle("Calculator");
	primaryStage.setWidth(400);
	primaryStage.setHeight(400);
	primaryStage.setScene(scene);
	primaryStage.setResizable(false);
	primaryStage.show();
	}
}