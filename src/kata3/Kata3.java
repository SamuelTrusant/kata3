package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histograma = new Histogram<String>();
        
        histograma.increment("ulpgc.es");
        histograma.increment("dis.ulpgc.es");
        histograma.increment("gmail.com");
        histograma.increment("gmail.com");
        histograma.increment("ulpgc.es");
        histograma.increment("gmail.com");
        histograma.increment("gmail.com");
        histograma.increment("ulpgc.es");
        histograma.increment("dis.ulpgc.es");
        
        
        HistogramDisplay histogram = new HistogramDisplay(histograma);
        histogram.execute();
    }
    
}
