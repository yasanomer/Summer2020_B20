package day58_Polymorphism.DeviceTask;
/*
	5. create an Interface called AndroidApp that can inherit from Downloadable
				variables: AppStoreName, Google Play
 */
public interface  AndroidApp extends Downloadable{
    String  AppStoreName = "Google Play";
}
