package com.assignment.question;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    private static FileBasedConfigurationManagerImpl instance;

    //stwp-1 make constructor private
    private FileBasedConfigurationManagerImpl(){

    }

    //step-2 create a static method to get the singleton instance
    public static FileBasedConfigurationManager getInstance() {
        if(instance == null) {
            instance = new FileBasedConfigurationManagerImpl();
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null; 
    }

    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
        //throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = properties.getProperty(key);
        if(value!=null) {
            return instance.convert(value, type);
        } else {
            return null;
        }
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
        //throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
         properties.setProperty(key, value.toString());
        //throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
        //throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    }

    @Override
    public void clear() {
        properties.clear();
        //throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

}
