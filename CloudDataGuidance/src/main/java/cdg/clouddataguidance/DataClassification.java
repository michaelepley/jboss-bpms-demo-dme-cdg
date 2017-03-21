package cdg.clouddataguidance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DataClassification implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Data Types - Files, RDBMS, NoSQL DB, DWH, unstructured, structured")
   private java.lang.String dataType;
   @org.kie.api.definition.type.Label("Security Classification - Secret, Top Secret, Unclassified")
   private java.lang.String dataSecurityLevel;
   @org.kie.api.definition.type.Label("Goal of data movement - Archive, Active Use")
   private java.lang.String dataPurpose;
   @org.kie.api.definition.type.Label("Data Transfer Security Requirement - Encrypted or Unencrypted")
   @org.kie.api.definition.type.Description("Convert this to rule - PII Ind requires encryption or specific s3 bucket.")
   private java.lang.String dataTransferSecurity;
   @org.kie.api.definition.type.Label("Data Security at Rest - Encrypted or Unencrypted")
   private java.lang.String dataAtRestSecurity;
   @org.kie.api.definition.type.Label("Data Migration Categories - Mission Data, Activity Data, Analytical Data, Corporate Data, Organizational Data")
   private java.lang.String dataMigrationCategories;

   @org.kie.api.definition.type.Label("Size of Data Movement")
   private java.lang.Integer dataSize;

   @org.kie.api.definition.type.Label("How frequently data is moved? - Real or near-real time/Hourly/Daily/Weekly/Monthly")
   private java.lang.String frequencyOfDataMovement;

   @org.kie.api.definition.type.Label("Migration Planned Date")
   private java.util.Date dataMigrationPlannedData;

   @org.kie.api.definition.type.Label("Data Migration Actual Date")
   private java.util.Date dataMigrationActualDate;

   @org.kie.api.definition.type.Label("Description of Data")
   private java.lang.String dataDescription;

   @org.kie.api.definition.type.Label("Ownership of Data")
   private java.lang.String dataOwner;

   @org.kie.api.definition.type.Label("Data Point of Contact")
   private java.lang.String dataPointOfContact;

   @org.kie.api.definition.type.Label("Current Data Storage Network(s)")
   private java.lang.String dataStorageNetwork;

   @org.kie.api.definition.type.Label("Method of Data Storage")
   private java.lang.String methodOfStorage;

   @org.kie.api.definition.type.Label("Data Relation - Production, Dissemination and consuming activities that use, produce or host data")
   private java.lang.String dataRelations;

   @org.kie.api.definition.type.Label("Data Manager")
   private java.lang.String dataManager;

   @org.kie.api.definition.type.Label("PII Information or not?")
   private java.lang.String PIIInd;

   public DataClassification()
   {
   }

   public java.lang.String getDataType()
   {
      return this.dataType;
   }

   public void setDataType(java.lang.String dataType)
   {
      this.dataType = dataType;
   }

   public java.lang.String getDataSecurityLevel()
   {
      return this.dataSecurityLevel;
   }

   public void setDataSecurityLevel(java.lang.String dataSecurityLevel)
   {
      this.dataSecurityLevel = dataSecurityLevel;
   }

   public java.lang.String getDataPurpose()
   {
      return this.dataPurpose;
   }

   public void setDataPurpose(java.lang.String dataPurpose)
   {
      this.dataPurpose = dataPurpose;
   }

   public java.lang.String getDataTransferSecurity()
   {
      return this.dataTransferSecurity;
   }

   public void setDataTransferSecurity(java.lang.String dataTransferSecurity)
   {
      this.dataTransferSecurity = dataTransferSecurity;
   }

   public java.lang.String getDataAtRestSecurity()
   {
      return this.dataAtRestSecurity;
   }

   public void setDataAtRestSecurity(java.lang.String dataAtRestSecurity)
   {
      this.dataAtRestSecurity = dataAtRestSecurity;
   }

   public java.lang.String getDataMigrationCategories()
   {
      return this.dataMigrationCategories;
   }

   public void setDataMigrationCategories(
         java.lang.String dataMigrationCategories)
   {
      this.dataMigrationCategories = dataMigrationCategories;
   }

   public java.lang.Integer getDataSize()
   {
      return this.dataSize;
   }

   public void setDataSize(java.lang.Integer dataSize)
   {
      this.dataSize = dataSize;
   }

   public java.lang.String getFrequencyOfDataMovement()
   {
      return this.frequencyOfDataMovement;
   }

   public void setFrequencyOfDataMovement(java.lang.String frequencyOfDataMovement)
   {
      this.frequencyOfDataMovement = frequencyOfDataMovement;
   }

   public java.util.Date getDataMigrationPlannedData()
   {
      return this.dataMigrationPlannedData;
   }

   public void setDataMigrationPlannedData(java.util.Date dataMigrationPlannedData)
   {
      this.dataMigrationPlannedData = dataMigrationPlannedData;
   }

   public java.util.Date getDataMigrationActualDate()
   {
      return this.dataMigrationActualDate;
   }

   public void setDataMigrationActualDate(java.util.Date dataMigrationActualDate)
   {
      this.dataMigrationActualDate = dataMigrationActualDate;
   }

   public java.lang.String getDataDescription()
   {
      return this.dataDescription;
   }

   public void setDataDescription(java.lang.String dataDescription)
   {
      this.dataDescription = dataDescription;
   }

   public java.lang.String getDataOwner()
   {
      return this.dataOwner;
   }

   public void setDataOwner(java.lang.String dataOwner)
   {
      this.dataOwner = dataOwner;
   }

   public java.lang.String getDataPointOfContact()
   {
      return this.dataPointOfContact;
   }

   public void setDataPointOfContact(java.lang.String dataPointOfContact)
   {
      this.dataPointOfContact = dataPointOfContact;
   }

   public java.lang.String getDataStorageNetwork()
   {
      return this.dataStorageNetwork;
   }

   public void setDataStorageNetwork(java.lang.String dataStorageNetwork)
   {
      this.dataStorageNetwork = dataStorageNetwork;
   }

   public java.lang.String getMethodOfStorage()
   {
      return this.methodOfStorage;
   }

   public void setMethodOfStorage(java.lang.String methodOfStorage)
   {
      this.methodOfStorage = methodOfStorage;
   }

   public java.lang.String getDataRelations()
   {
      return this.dataRelations;
   }

   public void setDataRelations(java.lang.String dataRelations)
   {
      this.dataRelations = dataRelations;
   }

   public java.lang.String getDataManager()
   {
      return this.dataManager;
   }

   public void setDataManager(java.lang.String dataManager)
   {
      this.dataManager = dataManager;
   }

   public java.lang.String getPIIInd()
   {
      return this.PIIInd;
   }

   public void setPIIInd(java.lang.String PIIInd)
   {
      this.PIIInd = PIIInd;
   }

   public DataClassification(java.lang.String dataType,
         java.lang.String dataSecurityLevel, java.lang.String dataPurpose,
         java.lang.String dataTransferSecurity,
         java.lang.String dataAtRestSecurity,
         java.lang.String dataMigrationCategories, java.lang.Integer dataSize,
         java.lang.String frequencyOfDataMovement,
         java.util.Date dataMigrationPlannedData,
         java.util.Date dataMigrationActualDate,
         java.lang.String dataDescription, java.lang.String dataOwner,
         java.lang.String dataPointOfContact,
         java.lang.String dataStorageNetwork, java.lang.String methodOfStorage,
         java.lang.String dataRelations, java.lang.String dataManager,
         java.lang.String PIIInd)
   {
      this.dataType = dataType;
      this.dataSecurityLevel = dataSecurityLevel;
      this.dataPurpose = dataPurpose;
      this.dataTransferSecurity = dataTransferSecurity;
      this.dataAtRestSecurity = dataAtRestSecurity;
      this.dataMigrationCategories = dataMigrationCategories;
      this.dataSize = dataSize;
      this.frequencyOfDataMovement = frequencyOfDataMovement;
      this.dataMigrationPlannedData = dataMigrationPlannedData;
      this.dataMigrationActualDate = dataMigrationActualDate;
      this.dataDescription = dataDescription;
      this.dataOwner = dataOwner;
      this.dataPointOfContact = dataPointOfContact;
      this.dataStorageNetwork = dataStorageNetwork;
      this.methodOfStorage = methodOfStorage;
      this.dataRelations = dataRelations;
      this.dataManager = dataManager;
      this.PIIInd = PIIInd;
   }

}