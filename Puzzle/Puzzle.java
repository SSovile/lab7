package com.company.Puzzle;

public class Puzzle {
        private int numberOfElements;
        private int width;
        private int height;
        private int age;
        private String type;
        private String name;
        private String description;
        private String producer;

        protected int price;

        static int count;

        public Puzzle(int numberOfElements, int width, int height, int age, String type, String name,
                      String description, String producer, int price) {
                setValues(numberOfElements, width, height, age, type,name,description,producer,price);
                count++;
        }

        public Puzzle(int numberOfElements, int width, int height) {
                this(numberOfElements,width,height,100,"type","Hasbro","Opus",
                        "Hasbro",100);
        }

        public Puzzle() {
                this(2,100,100,100,"type","name","Opus",
                        "Hasbro",100);
        }

        public String toString() {
                return "Number of elements: " + numberOfElements +
                        ", Width: " + width +
                        ", Height: " + height +
                        ", Age: " + age +
                        ", Type: " + type +
                        ", Name: " + name +
                        ", Description: " + description +
                        ", Producer: " + producer +
                        ", Price: " + price;
        }

        public void resetValues(int numberOfElements, int width, int height, int age, String type, String name,
                                String description, String producer, int price) {
                setValues(numberOfElements, width, height, age, type,name,description,producer,price);
        }

        private void setValues(int numberOfElements, int width, int height, int age, String type, String name,
                               String description, String producer, int price) {
                this.numberOfElements = numberOfElements;
                this.width = width;
                this.height = height;
                this.age = age;
                this.type = type;
                this.name = name;
                this.description = description;
                this.producer = producer;
                this.price = price;
        }

        public void setNumberOfElements(int numberOfElements){
                this.numberOfElements = numberOfElements;
        }

        public void setWidth(int width) {
                this.width = width;
        }

        public void setHeight(int height) {
                this.height = height;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public void setType(String type) {
                this.type = type;
        }

        public void setName(String name) {
                        this.name = name;

        }
        public void setDescription(String description) {
                this.description = description;
        }

        public void setProducer(String producer) {
                this.producer = producer;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public static void setCount(int count) {
                Puzzle.count = count;
        }

        public int getNumberOfElements(){
                return numberOfElements;
        }

        public int getWidth() {
                return width;
        }

        public int getHeight() {
                return height;
        }

        public int getAge() {
                return age;
        }

        public String getType() {
                return type;
        }

        public String getName() {
                return name;
        }

        public String getDescription() {
                return description;
        }

        public String getProducer() {
                return producer;
        }

        public int getPrice() {
                return price;
        }

        public static int getCount() {
                return count;
        }

        public void printNumberOfElements(){
                System.out.println(numberOfElements);
        }

        public void printWidth(){
                System.out.println(width);
        }

        public void printHeight(){
                System.out.println(height);
        }

        public void printAge(){
                System.out.println(age);
        }

        public void printType(){
                System.out.println(type);
        }

        public void printName(){
                System.out.println(name);
        }

        public void printDescription(){
                System.out.println(description);
        }

        public void printProducer(){
                System.out.println(producer);
        }

        public void printPrice(){
                System.out.println(price);
        }

        public static void printCount(){
                System.out.println(count);
        }

        public void printsCount(){
                System.out.println(count);
        }
}
