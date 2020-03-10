package model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Τμήμα ΑΘΗ-1
 * @author ΑΛΕΞΕΛΗΣ ΠΑΥΛΟΣ - 127928
 * @author ΑΛΕΞΙΑΔΟΥ ΔΕΣΠΟΙΝΑ - 118843
 * @author ΑΝΑΓΝΩΣΤΗΣ ΙΩΑΝΝΗΣ - 118847
 */

@Entity
@Table(name = "COUNTRY_DATASET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CountryDataset.findAll", query = "SELECT c FROM CountryDataset c")
    , @NamedQuery(name = "CountryDataset.findByStartYear", query = "SELECT c FROM CountryDataset c WHERE c.startYear = :startYear")
    , @NamedQuery(name = "CountryDataset.findByName", query = "SELECT c FROM CountryDataset c WHERE c.name = :name")
    , @NamedQuery(name = "CountryDataset.findByEndYear", query = "SELECT c FROM CountryDataset c WHERE c.endYear = :endYear")
    , @NamedQuery(name = "CountryDataset.findByDescription", query = "SELECT c FROM CountryDataset c WHERE c.description = :description")
    , @NamedQuery(name = "CountryDataset.findByDatasetId", query = "SELECT c FROM CountryDataset c WHERE c.datasetId = :datasetId")})
public class CountryDataset implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "START_YEAR")
    @SerializedName(value="startYear", alternate="start_date")
    private String startYear;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "END_YEAR")
    @SerializedName(value="endYear", alternate="end_date")
    private String endYear;
    @Column(name = "DESCRIPTION")
    private String description;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DATASET_ID")
    private Integer datasetId;
    @JoinColumn(name = "COUNTRY_CODE", referencedColumnName = "ISO_CODE")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Country countryCode;
    @OneToMany(mappedBy = "dataset", cascade = CascadeType.PERSIST)
    @SerializedName(value="countryDatasetCollection")
    private Collection<CountryData> countryDataCollection;
    
    @Transient
    private ArrayList<ArrayList<String>> data;

    public ArrayList<ArrayList<String>> getData() {
        return data;
    }

    public void setData(ArrayList<ArrayList<String>> data) {
        this.data = data;
    }

    public CountryDataset() {
    }

    public CountryDataset(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public CountryDataset(Integer datasetId, String startYear, String name, String endYear) {
        this.datasetId = datasetId;
        this.startYear = startYear.substring(0, 4);
        this.name = name;
        this.endYear = endYear.substring(0, 4);
    }

    public String getStartYear() {
        return startYear.substring(0, 4);
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear.substring(0, 4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndYear() {
        return endYear.substring(0, 4);
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear.substring(0, 4);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    @XmlTransient
    public Collection<CountryData> getCountryDataCollection() {
        return countryDataCollection;
    }

    public void setCountryDataCollection(Collection<CountryData> countryDataCollection) {
        this.countryDataCollection = countryDataCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datasetId != null ? datasetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CountryDataset)) {
            return false;
        }
        CountryDataset other = (CountryDataset) object;
        if ((this.datasetId == null && other.datasetId != null) || (this.datasetId != null && !this.datasetId.equals(other.datasetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "econometrica2.CountryDataset[ datasetId=" + datasetId + " ]";
    }
    
}
