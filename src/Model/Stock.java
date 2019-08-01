/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author asethy
 */
public class Stock 
{
    private String symbol;
    private Date date;
    private float open;
    private float close;
    private float low;
    private float high;
    private int volume;
    
    private void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }
    
    public String getSymbol()
    {
        return symbol;
    }
    
    private void setDate(Date date)
    {
        this.date = date;
    }
    
    public Date getDate()
    {
        return date;
    }
    
    private void setOpen(float open)
    {
        this.open = open;
    }
    
    public float getOpen()
    {
        return open;
    }
    
    private void setClose(float close)
    {
        this.close = close;
    }
    
    public float getClose()
    {
        return close;
    }
    
    private void setLow(float low)
    {
        this.low = low;
    }
    
    public float getLow()
    {
        return low;
    }
    
    private void setHigh(float high)
    {
        this.high = high;
    }
    
    public float getHigh()
    {
        return high;
    }
    
    private void setVolume(int volume)
    {
        this.volume = volume;
    }
    
    public int getVolume()
    {
        return volume;
    }
    
    private void Stock()
    {
        this.setSymbol(symbol);
        this.setDate(date);
        this.setOpen(open);
        this.setClose(close);
        this.setLow(low);
        this.setHigh(high);
        this.setVolume(volume);
    }
    
    private void Stock(String symbol,Date date,float open,float close,float low,float high,int volume)
    {
        this.setSymbol(symbol);
        this.setDate(date);
        this.setOpen(open);
        this.setClose(close);
        this.setLow(low);
        this.setHigh(high);
        this.setVolume(volume);
    }
    
}
