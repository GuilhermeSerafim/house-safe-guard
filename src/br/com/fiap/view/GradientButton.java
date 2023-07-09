package br.com.fiap.view;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class GradientButton extends JButton {

    private Color startColor;
    private Color endColor;
    private int startAngle;
    private int endAngle;
    private Color shadowColor;
    private int shadowSize;
    private int borderRadius;

    public GradientButton(String text, Color startColor, Color endColor, int startAngle, int endAngle, int shadowSize, int borderRadius) {
        super(text);
        this.startColor = startColor;
        this.endColor = endColor;
        this.startAngle = startAngle;
        this.endAngle = endAngle;
        this.shadowColor = shadowColor;
        this.shadowSize = shadowSize;
        this.borderRadius = borderRadius;
        setContentAreaFilled(false);
        setFocusPainted(false);
        setMargin(new Insets(0, 0, 0, 0));
        setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        int buttonWidth = getWidth();
        int buttonHeight = getHeight();

        GradientPaint gradientPaint = new GradientPaint(
                0, 0, startColor,
                buttonWidth, buttonHeight, endColor);

        g2d.setPaint(gradientPaint);
        g2d.fill(new RoundRectangle2D.Double(0, 0, buttonWidth - 1, buttonHeight - 1, borderRadius, borderRadius));

        // Adiciona o box shadow
        g2d.setColor(shadowColor);
        for (int i = 0; i < shadowSize; i++) {
            g2d.drawRoundRect(i, i, buttonWidth - 1 - i * 2, buttonHeight - 1 - i * 2, borderRadius, borderRadius);
        }

        g2d.dispose();

        super.paintComponent(g);
    }
}
