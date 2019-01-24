package common.childs;

im
        d = side;
    }


    public String getColor() {
        color = ColorHelper.randomColor();
        return color;
    }


    public double getArea() {
        if (side == 0) {
            shapeDraw();
        }
        area = a * c;

        return area;
    }

    public void shapeAllInformation() {
        System.out.println("Фігура: квадрат" + ", площа: " + area + ", довжина сторони: " +
                side + ", колір: " + color);

    }

}