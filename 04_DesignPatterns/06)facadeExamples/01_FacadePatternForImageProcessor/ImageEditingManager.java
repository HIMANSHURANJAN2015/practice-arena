import service.AnalyticsService;
import service.FilterService;
import service.ImageLoader;
import service.ImageModifier;

//step-3 modify original class
public class ImageEditingManager {
    /*
    Keeping the below commented portions to help me visualise how beautifully the original class have been simplified by using Facade pattern :D
    */
    
    /*
    private ImageLoader imageLoader;
    private FilterService filterService;
    private ImageModifier imageModifier;
    private ImageWriter imageWriter;
    private AnalyticsService analyticsService;

    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageLoader = imageLoader;
        this.filterService = filterService;
        this.imageModifier = imageModifier;
        this.imageWriter = imageWriter;
        this.analyticsService = analyticsService;
    }

    public void editImage(String imagePath, String filterType, int brightness) {

        Image image = imageLoader.loadImage(imagePath);

        filterService.applyFilter(image, filterType);
        imageModifier.adjustBrightness(image, brightness);

        imageWriter.saveImage(image);
        analyticsService.store(image);
    }
    */

    //step-3.1: Replace all shifted atributes with Facade attribute
    private ImageEditingFacade imageEditingFacade;

    //step-3.2 Initialise facade object in original class construcotr
    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageEditingFacade = new ImageEditingFacade(imageLoader, filterService, imageModifier, imageWriter, analyticsService);
    }

    //step-3.3 Perform the task
    public void editImage(String imagePath, String filterType, int brightness) {
        this.imageEditingFacade.editImage(imagePath, filterType, brightness);
    }
}
