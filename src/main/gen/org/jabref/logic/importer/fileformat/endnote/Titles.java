//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.07 at 05:50:47 PM BRT 
//


package org.jabref.logic.importer.fileformat.endnote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "secondaryTitle",
    "tertiaryTitle",
    "altTitle",
    "shortTitle",
    "translatedTitle"
})
@XmlRootElement(name = "titles")
public class Titles {

    protected Title title;
    @XmlElement(name = "secondary-title")
    protected SecondaryTitle secondaryTitle;
    @XmlElement(name = "tertiary-title")
    protected TertiaryTitle tertiaryTitle;
    @XmlElement(name = "alt-title")
    protected AltTitle altTitle;
    @XmlElement(name = "short-title")
    protected ShortTitle shortTitle;
    @XmlElement(name = "translated-title")
    protected TranslatedTitle translatedTitle;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the secondaryTitle property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryTitle }
     *     
     */
    public SecondaryTitle getSecondaryTitle() {
        return secondaryTitle;
    }

    /**
     * Sets the value of the secondaryTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryTitle }
     *     
     */
    public void setSecondaryTitle(SecondaryTitle value) {
        this.secondaryTitle = value;
    }

    /**
     * Gets the value of the tertiaryTitle property.
     * 
     * @return
     *     possible object is
     *     {@link TertiaryTitle }
     *     
     */
    public TertiaryTitle getTertiaryTitle() {
        return tertiaryTitle;
    }

    /**
     * Sets the value of the tertiaryTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TertiaryTitle }
     *     
     */
    public void setTertiaryTitle(TertiaryTitle value) {
        this.tertiaryTitle = value;
    }

    /**
     * Gets the value of the altTitle property.
     * 
     * @return
     *     possible object is
     *     {@link AltTitle }
     *     
     */
    public AltTitle getAltTitle() {
        return altTitle;
    }

    /**
     * Sets the value of the altTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltTitle }
     *     
     */
    public void setAltTitle(AltTitle value) {
        this.altTitle = value;
    }

    /**
     * Gets the value of the shortTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ShortTitle }
     *     
     */
    public ShortTitle getShortTitle() {
        return shortTitle;
    }

    /**
     * Sets the value of the shortTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortTitle }
     *     
     */
    public void setShortTitle(ShortTitle value) {
        this.shortTitle = value;
    }

    /**
     * Gets the value of the translatedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link TranslatedTitle }
     *     
     */
    public TranslatedTitle getTranslatedTitle() {
        return translatedTitle;
    }

    /**
     * Sets the value of the translatedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslatedTitle }
     *     
     */
    public void setTranslatedTitle(TranslatedTitle value) {
        this.translatedTitle = value;
    }

}
