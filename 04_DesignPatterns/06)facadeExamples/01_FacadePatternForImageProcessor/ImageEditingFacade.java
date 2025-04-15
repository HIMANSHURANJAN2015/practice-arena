
import service.*;
import model.*;

//step-2 Create facade class, that encapsulate the interactions 
public class ImageEditingFacade {
    //step-2.1: Shift related attributes from original class to facade class
    private ImageLoader imageLoader;
    private FilterService filterService;
    private ImageModifier imageModifier;
    private ImageWriter imageWriter;
    private AnalyticsService analyticsService;

    //step-2.2 constructor for facade classs
    public ImageEditingFacade(ImageLoader imageLoader, FilterService filterService, 
                    ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
            this.imageLoader = imageLoader;
            this.filterService = filterService;
            this.imageModifier = imageModifier;
            this.imageWriter = imageWriter;
            this.analyticsService = analyticsService;
    }

    //step-2.3 perform the task in the facade class method
    public void editImage(String imagePath, String filterType, int brightness) {

        Image image = imageLoader.loadImage(imagePath);

        filterService.applyFilter(image, filterType);
        
        imageModifier.adjustBrightness(image, brightness);

        imageWriter.saveImage(image);
        
        analyticsService.store(image);
    } 

    
}
