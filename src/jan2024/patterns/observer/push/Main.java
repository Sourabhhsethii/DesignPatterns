package jan2024.patterns.observer.push;

public class Main {

    public static void main(String[] args) {

        ////////////////////////////////////////////
        /// Push     Style      Communication  ////
        ///////////////////////////////////////////
        var dataSOurece = new DataSource();
        var sheet1 = new SpreedSheet();
        var sheet2 = new SpreedSheet();
        var chart = new PieChart();

        dataSOurece.addObserver(sheet1);
        dataSOurece.addObserver(sheet2);
        dataSOurece.addObserver(chart);

        dataSOurece.setValue(1);
        dataSOurece.setValue(2);
        ////////////////////////////////////////////
        /// Push     Style      Communication  ////
        ///////////////////////////////////////////

        ////////////////////////////////////////////
        /// Pull     Style      Communication  ////
        ///////////////////////////////////////////


    }}
