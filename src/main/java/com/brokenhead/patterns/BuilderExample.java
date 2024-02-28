package com.brokenhead.patterns;

public class BuilderExample {

    private String name;
    private String company;
    private int id;
    private boolean hasJob;

    /**
     * Private constructor for the final call .build();
     */
    private BuilderExample(BuilderExampleBuilder builderExample) {
        this.name = builderExample.name;
        this.id = builderExample.id;
        this.company = builderExample.company;
        this.hasJob = builderExample.hasJob;
    }

    // ...other methods, get, set, etc...

    public static class BuilderExampleBuilder {

        private String name;
        private String company;
        private int id;
        private boolean hasJob;

        /**
         * Constructor for creation of an object with basic or default parameters, minimal
         * set of values and etc.
         */
        public BuilderExampleBuilder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public BuilderExampleBuilder company(String company) {
            this.company = company;
            return this;
        }

        public BuilderExampleBuilder hasJob(boolean hasJob) {
            this.hasJob = hasJob;
            return this;
        }

        public BuilderExample build() {
            return new BuilderExample(this);
        }
    }
}
