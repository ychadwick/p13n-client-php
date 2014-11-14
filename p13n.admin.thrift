namespace java com.boxalino.p13n.admin.thrift
namespace php  com.boxalino.p13n.admin.thrift

struct ProfilePropertyValue {
  1: string profileId,
  2: string propertyName,
  3: string propertyValue, 
  4: i32 confidence
}

struct Choice {
  11: string id,
  21: map<string, string> selections,
  31: map<string, i32> variantIds,
  41: bool sticky,
  51: bool traced 
}

struct Scenario {
  11: string id,
  21: map<string, string> localizedTitles,
  31: string queryP13nScript
}

struct RecommendationVariant {
  11: string id,
  21: string mode = "firstfull",
  31: list<string> scenarioIds
}

exception P13nServiceException {
  1: required string message
}

service P13nAdminService {
/**
 * <dl>
 * <dt>@param xmlPayload</dt>
 * <dd>the XML to upload as raw data</dd>
 *
 * <dt>@return</dt>
 * <dd>binary data</dd>
 *
 * <dt>@throws P13nServiceException</dt>
 * <dd>an exception containing an error message</dd>
 * </dl>
 */
  binary uploadChoiceConfiguration(binary xmlPayload) throws (1: P13nServiceException p13nServiceException),

/**
 * <dl>
 * <dt>@param profilePropertyValues</dt>
 * <dd>the list of ProfilePropertyValue objects to save</dd>
 *
 * <dt>@return</dt>
 * <dd>an integer</dd>
 *
 * <dt>@throws P13nServiceException</dt>
 * <dd>an exception containing an error message</dd>
 * </dl>
 */
  i32 saveProfileProperties(list<ProfilePropertyValue> profilePropertyValues) throws (1: P13nServiceException p13nServiceException),

/**
 * <dl>
 * <dt>@param profilePropertyValues</dt>
 * <dd>the list of ProfilePropertyValue objects to save</dd>
 *
 * <dt>@return</dt>
 * <dd>an integer</dd>
 *
 * <dt>@throws P13nServiceException</dt>
 * <dd>an exception containing an error message</dd>
 * </dl>
 */
  i32 replaceProfileProperties(list<ProfilePropertyValue> profilePropertyValues) throws (1: P13nServiceException p13nServiceException),

/**
 * <dl>
 * <dt>@param command</dt>
 * <dd>the command to execute</dd>
 *
 * <dt>@return</dt>
 * <dd>a string containing the result of the command</dd>
 *
 * <dt>@throws P13nServiceException</dt>
 * <dd>an exception containing an error message</dd>
 * </dl>
 */
  string command(string command) throws (1: P13nServiceException p13nServiceException),
  
  Choice retrieveChoice(string id) throws (1: P13nServiceException p13nServiceException),
  Scenario retrieveScenario(string id) throws (1: P13nServiceException p13nServiceException),
  RecommendationVariant retrieveRecommendationVariant(string id) throws (1: P13nServiceException p13nServiceException),
  string persistChoice(Choice choice) throws (1: P13nServiceException p13nServiceException),
  string persistScenario(Scenario scenario) throws (1: P13nServiceException p13nServiceException),
  string persistRecommendationVariant(RecommendationVariant recommendationVariant) throws (1: P13nServiceException p13nServiceException),
}