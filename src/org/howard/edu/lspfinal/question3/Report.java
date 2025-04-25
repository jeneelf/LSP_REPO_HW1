package org.howard.edu.lspfinal.question3;

/**
 * class for generating reports using Template Method design pattern
 */
public abstract class Report {
    // Template Method design pattern for report generation
    public final void generateReport() {
        loadData();
        formatData();
        printReport();
    }

    protected abstract void loadData();
    protected abstract void formatData();
    protected abstract void printReport();
}
