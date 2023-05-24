package Composition;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Computer[] pentium5 = {
                new Computer("Pentium 5", "DDR5", 32, "RTX 900",
                        new HardDrive("SSD Gx5", 2), new CPU("i7 56xf", 200)),
                new Computer("Pentium 3", "DDR3", 8, "Integrated",
                        new HardDrive("HDD Gx5", 1), new CPU("i9 56xf", 300)),
                new Computer("Pentium 7", "DDR5", 64, "RTX 1200",
                        new HardDrive("SSD + HDD Gx5", 5), new CPU("i5 56xf", 100)),
                new PC4("PC4", "DDR6", 64, "RTX 1000",
                        new HardDrive("SSD Gx5", 2), new CPU("i7 56xf", 200))
        };

        for (Computer pcs : pentium5)
        {
            System.out.println(pcs);
        }
    }
}
