package com.dxsys.patterns.behavioural.nov2023.statergy.problem;

/**
 * Violation of SRP
 * Violation of OCP
 * Diffult to Extend & Test...
 */
public class ImageStorage {

    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    /**
     * Violation of OCP
     * @param fileName
     */
    public void store(String fileName){
        // JPEG, PNG ...
        // B&W, High Contract
        if(compressor == "jpeg"){
            System.out.println(18 + "Compressing Using jpeg");
        } else if (compressor == "png"){
            System.out.println("Compressing using PNG");
        }

        /**
         * Violation of OCP
         */
        if(filter == "b&w"){
            System.out.println("Applying B&W filter");
        } else if(filter == "high-contrast"){
            System.out.println("Applying high contrast filter");
        }

    }
}
