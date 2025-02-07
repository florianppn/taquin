package main.controller;

import main.model.*;

import java.awt.event.*;

public class MouseController implements MouseListener {

    private Taquin taquin;

    public MouseController(Taquin taquin) {
        this.taquin = taquin;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = this.getColumn(e);
        int y = this.getRow(e);
        this.taquin.setClickX(x);
        this.taquin.setClickY(y);
        this.taquin.move(y, x);
    }

    public int getRow(MouseEvent e) {
        int y = e.getY();
        int gridSize = this.taquin.getSize();
        int cellHeight = e.getComponent().getHeight() / gridSize;
        return y / cellHeight;
    }

    public int getColumn(MouseEvent e) {
        int x = e.getX();
        int gridSize = this.taquin.getSize();
        int cellWidth = e.getComponent().getWidth() / gridSize;
        return x / cellWidth;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //
    }

}
