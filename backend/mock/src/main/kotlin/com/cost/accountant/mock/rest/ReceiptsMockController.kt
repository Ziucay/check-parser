package com.cost.accountant.mock.rest

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ReceiptsMockController {

    companion object {
        val logger = LoggerFactory.getLogger(ReceiptsMockController::class.java)
    }

    @GetMapping("/mock/receipts/list")
    fun getAllReceipts(): String {

        val result =
            """
                [
                  {
                    "_id": "6378f1e80f8402fef5349d7b",
                    "createdAt": "2022-11-19T15:10:32+00:00",
                    "ticket": {
                      "document": {
                        "receipt": {
                          "cashTotalSum": 0,
                          "code": 3,
                          "creditSum": 0,
                          "dateTime": "2022-11-01T16:09:00",
                          "ecashTotalSum": 39795,
                          "fiscalDocumentFormatVer": 4,
                          "fiscalDocumentNumber": 107541,
                          "fiscalDriveNumber": "9960440301643001",
                          "fiscalSign": 3678250787,
                          "fnsUrl": "www.nalog.gov.ru",
                          "items": [
                            {
                              "name": "ОГУРЦЫ гладкие 1кг",
                              "nds": 2,
                              "paymentType": 4,
                              "price": 7999,
                              "productType": 1,
                              "quantity": 0.308,
                              "sum": 2464
                            },
                            {
                              "name": "Филе ЦБ охл лоток (в):5",
                              "nds": 2,
                              "paymentType": 4,
                              "price": 26159,
                              "productType": 1,
                              "productCodeDataError": "not supported product type 3",
                              "quantity": 1.014,
                              "sum": 26525
                            },
                            {
                              "name": "МОРКОВЬ 1кг",
                              "nds": 2,
                              "paymentType": 4,
                              "price": 1999,
                              "productType": 1,
                              "quantity": 0.716,
                              "sum": 1431
                            },
                            {
                              "name": "ЛИМОНЫ 1кг",
                              "nds": 2,
                              "paymentType": 4,
                              "price": 10399,
                              "productType": 1,
                              "quantity": 0.144,
                              "sum": 1497
                            },
                            {
                              "name": "МАГНИТ/МОЯ ЦЕНА Лимонная кислота 80г сашет:30",
                              "nds": 1,
                              "paymentType": 4,
                              "price": 4479,
                              "productType": 1,
                              "productCodeDataError": "not supported product type 3",
                              "quantity": 1,
                              "sum": 4479
                            },
                            {
                              "name": "Лаваш ролл пшеничный 200г п/уп (Ухуд)",
                              "nds": 2,
                              "paymentType": 4,
                              "price": 3399,
                              "productType": 1,
                              "productCodeDataError": "not supported product type 3",
                              "quantity": 1,
                              "sum": 3399
                            }
                          ],
                          "kktRegId": "0001473719030755    ",
                          "nds10": 3210,
                          "nds18": 747,
                          "operationType": 1,
                          "operator": "Директор магазина Оруджова",
                          "prepaidSum": 0,
                          "provisionSum": 0,
                          "requestNumber": 176,
                          "retailPlace": "Магазин  Магнит  Гречанка",
                          "retailPlaceAddress": "420500, Татарстан Респ, Верхнеуслонский р-н, Иннополис г, Спортивная ул, дом № 110",
                          "shiftNumber": 248,
                          "taxationType": 1,
                          "appliedTaxationType": 1,
                          "totalSum": 39795,
                          "user": "АКЦИОНЕРНОЕ ОБЩЕСТВО \"ТАНДЕР\"",
                          "userInn": "2310031475  "
                        }
                      }
                    }
                  },
                  {
                    "_id": "6378f1593d0e75074b7b708e",
                    "createdAt": "2022-11-19T15:08:09+00:00",
                    "ticket": {
                      "document": {
                        "receipt": {
                          "cashTotalSum": 0,
                          "code": 3,
                          "creditSum": 0,
                          "dateTime": "2022-11-03T20:08:00",
                          "ecashTotalSum": 22196,
                          "fiscalDocumentFormatVer": 4,
                          "fiscalDocumentNumber": 122139,
                          "fiscalDriveNumber": "9960440302384768",
                          "fiscalSign": 1802911983,
                          "fnsUrl": "www.nalog.gov.ru",
                          "items": [
                            {
                              "name": "Нап.COOL COLA б/ал.газ.ПЭТ 1.5л",
                              "nds": 1,
                              "paymentType": 4,
                              "price": 11999,
                              "productType": 1,
                              "productCodeDataError": "not supported product type 3",
                              "quantity": 1,
                              "sum": 11999
                            },
                            {
                              "name": "*ЮБИЛ.Печ.ТРАДИЦИОННОЕ вит.112г",
                              "nds": 1,
                              "paymentType": 4,
                              "price": 3399,
                              "productType": 1,
                              "productCodeDataError": "not supported product type 3",
                              "quantity": 3,
                              "sum": 10197
                            }
                          ],
                          "kktRegId": "0006326286004208    ",
                          "nds18": 3699,
                          "operationType": 1,
                          "operator": "Козина Виктория Викторовна, Продавец-каccир",
                          "operatorInn": "161501429717",
                          "prepaidSum": 0,
                          "properties": {
                            "propertyName": "Код",
                            "propertyValue": "Y833"
                          },
                          "provisionSum": 0,
                          "requestNumber": 515,
                          "retailPlace": "Y833 12774-Пятерочка",
                          "retailPlaceAddress": "420500,16 - Республика Татарстан (Татарстан), м.р-н Верхнеуслонский г/п город Иннополис, г Иннополис,, ул Спортивная, Дом 126",
                          "shiftNumber": 211,
                          "taxationType": 1,
                          "appliedTaxationType": 1,
                          "totalSum": 22196,
                          "user": "Агроторг ООО",
                          "userInn": "7825706086  "
                        }
                      }
                    }
                  },
                  {
                    "_id": "6378f1ce0f8402fef5349d79",
                    "createdAt": "2022-11-19T15:10:06+00:00",
                    "ticket": {
                      "document": {
                        "receipt": {
                          "cashTotalSum": 0,
                          "code": 3,
                          "creditSum": 0,
                          "dateTime": "2022-11-12T16:23:00",
                          "ecashTotalSum": 23500,
                          "fiscalDocumentFormatVer": 2,
                          "fiscalDocumentNumber": 11352,
                          "fiscalDriveNumber": "9961440301040829",
                          "fiscalSign": 2327608479,
                          "items": [
                            {
                              "name": "Циннамон",
                              "nds": 6,
                              "paymentType": 4,
                              "price": 6500,
                              "productType": 1,
                              "quantity": 1,
                              "sum": 6500
                            },
                            {
                              "name": "Булочка с вишней ",
                              "nds": 6,
                              "paymentType": 4,
                              "price": 4500,
                              "productType": 1,
                              "quantity": 2,
                              "sum": 9000
                            },
                            {
                              "name": "Московская плюшка",
                              "nds": 6,
                              "paymentType": 4,
                              "price": 4000,
                              "productType": 1,
                              "quantity": 2,
                              "sum": 8000
                            }
                          ],
                          "kktRegId": "0004756413042366    ",
                          "ndsNo": 23500,
                          "operationType": 1,
                          "operator": "Мингулова Алена  Викторовна",
                          "operatorInn": "161203486798",
                          "prepaidSum": 0,
                          "provisionSum": 0,
                          "requestNumber": 237,
                          "retailPlace": "ул Спортивная, д 120",
                          "shiftNumber": 32,
                          "taxationType": 32,
                          "appliedTaxationType": 32,
                          "totalSum": 23500,
                          "user": "БЕЛОВА МАРИЯ ИГОРЕВНА",
                          "userInn": "632525178730"
                        }
                      }
                    }
                  }
                ]
            """.trimIndent()
        return result
    }

    @GetMapping("/mock/receipt")
    fun getReceiptById(@RequestParam("id") id: Int): String {
        if (id !in 1..3)
            return "error"
        when (id) {
            1 ->
                return """[{
                "_id": "6378f1e80f8402fef5349d7b",
                "createdAt": "2022-11-19T15:10:32+00:00",
                "ticket": {
                  "document": {
                    "receipt": {
                      "cashTotalSum": 0,
                      "code": 3,
                      "creditSum": 0,
                      "dateTime": "2022-11-01T16:09:00",
                      "ecashTotalSum": 39795,
                      "fiscalDocumentFormatVer": 4,
                      "fiscalDocumentNumber": 107541,
                      "fiscalDriveNumber": "9960440301643001",
                      "fiscalSign": 3678250787,
                      "fnsUrl": "www.nalog.gov.ru",
                      "items": [
                        {
                          "name": "ОГУРЦЫ гладкие 1кг",
                          "nds": 2,
                          "paymentType": 4,
                          "price": 7999,
                          "productType": 1,
                          "quantity": 0.308,
                          "sum": 2464
                        },
                        {
                          "name": "Филе ЦБ охл лоток (в):5",
                          "nds": 2,
                          "paymentType": 4,
                          "price": 26159,
                          "productType": 1,
                          "productCodeDataError": "not supported product type 3",
                          "quantity": 1.014,
                          "sum": 26525
                        },
                        {
                          "name": "МОРКОВЬ 1кг",
                          "nds": 2,
                          "paymentType": 4,
                          "price": 1999,
                          "productType": 1,
                          "quantity": 0.716,
                          "sum": 1431
                        },
                        {
                          "name": "ЛИМОНЫ 1кг",
                          "nds": 2,
                          "paymentType": 4,
                          "price": 10399,
                          "productType": 1,
                          "quantity": 0.144,
                          "sum": 1497
                        },
                        {
                          "name": "МАГНИТ/МОЯ ЦЕНА Лимонная кислота 80г сашет:30",
                          "nds": 1,
                          "paymentType": 4,
                          "price": 4479,
                          "productType": 1,
                          "productCodeDataError": "not supported product type 3",
                          "quantity": 1,
                          "sum": 4479
                        },
                        {
                          "name": "Лаваш ролл пшеничный 200г п/уп (Ухуд)",
                          "nds": 2,
                          "paymentType": 4,
                          "price": 3399,
                          "productType": 1,
                          "productCodeDataError": "not supported product type 3",
                          "quantity": 1,
                          "sum": 3399
                        }
                      ],
                      "kktRegId": "0001473719030755    ",
                      "nds10": 3210,
                      "nds18": 747,
                      "operationType": 1,
                      "operator": "Директор магазина Оруджова",
                      "prepaidSum": 0,
                      "provisionSum": 0,
                      "requestNumber": 176,
                      "retailPlace": "Магазин  Магнит  Гречанка",
                      "retailPlaceAddress": "420500, Татарстан Респ, Верхнеуслонский р-н, Иннополис г, Спортивная ул, дом № 110",
                      "shiftNumber": 248,
                      "taxationType": 1,
                      "appliedTaxationType": 1,
                      "totalSum": 39795,
                      "user": "АКЦИОНЕРНОЕ ОБЩЕСТВО \"ТАНДЕР\"",
                      "userInn": "2310031475  "
                    }
                  }
                }
              }]"""
            2 ->
                return """[{
    "_id": "6378f1593d0e75074b7b708e",
    "createdAt": "2022-11-19T15:08:09+00:00",
    "ticket": {
      "document": {
        "receipt": {
          "cashTotalSum": 0,
          "code": 3,
          "creditSum": 0,
          "dateTime": "2022-11-03T20:08:00",
          "ecashTotalSum": 22196,
          "fiscalDocumentFormatVer": 4,
          "fiscalDocumentNumber": 122139,
          "fiscalDriveNumber": "9960440302384768",
          "fiscalSign": 1802911983,
          "fnsUrl": "www.nalog.gov.ru",
          "items": [
            {
              "name": "Нап.COOL COLA б/ал.газ.ПЭТ 1.5л",
              "nds": 1,
              "paymentType": 4,
              "price": 11999,
              "productType": 1,
              "productCodeDataError": "not supported product type 3",
              "quantity": 1,
              "sum": 11999
            },
            {
              "name": "*ЮБИЛ.Печ.ТРАДИЦИОННОЕ вит.112г",
              "nds": 1,
              "paymentType": 4,
              "price": 3399,
              "productType": 1,
              "productCodeDataError": "not supported product type 3",
              "quantity": 3,
              "sum": 10197
            }
          ],
          "kktRegId": "0006326286004208    ",
          "nds18": 3699,
          "operationType": 1,
          "operator": "Козина Виктория Викторовна, Продавец-каccир",
          "operatorInn": "161501429717",
          "prepaidSum": 0,
          "properties": {
            "propertyName": "Код",
            "propertyValue": "Y833"
          },
          "provisionSum": 0,
          "requestNumber": 515,
          "retailPlace": "Y833 12774-Пятерочка",
          "retailPlaceAddress": "420500,16 - Республика Татарстан (Татарстан), м.р-н Верхнеуслонский г/п город Иннополис, г Иннополис,, ул Спортивная, Дом 126",
          "shiftNumber": 211,
          "taxationType": 1,
          "appliedTaxationType": 1,
          "totalSum": 22196,
          "user": "Агроторг ООО",
          "userInn": "7825706086  "
        }
      }
    }
  }]"""
            else ->
                return """[{
"_id": "6378f1ce0f8402fef5349d79",
"createdAt": "2022-11-19T15:10:06+00:00",
"ticket": {
  "document": {
    "receipt": {
      "cashTotalSum": 0,
      "code": 3,
      "creditSum": 0,
      "dateTime": "2022-11-12T16:23:00",
      "ecashTotalSum": 23500,
      "fiscalDocumentFormatVer": 2,
      "fiscalDocumentNumber": 11352,
      "fiscalDriveNumber": "9961440301040829",
      "fiscalSign": 2327608479,
      "items": [
        {
          "name": "Циннамон",
          "nds": 6,
          "paymentType": 4,
          "price": 6500,
          "productType": 1,
          "quantity": 1,
          "sum": 6500
        },
        {
          "name": "Булочка с вишней ",
          "nds": 6,
          "paymentType": 4,
          "price": 4500,
          "productType": 1,
          "quantity": 2,
          "sum": 9000
        },
        {
          "name": "Московская плюшка",
          "nds": 6,
          "paymentType": 4,
          "price": 4000,
          "productType": 1,
          "quantity": 2,
          "sum": 8000
        }
      ],
      "kktRegId": "0004756413042366    ",
      "ndsNo": 23500,
      "operationType": 1,
      "operator": "Мингулова Алена  Викторовна",
      "operatorInn": "161203486798",
      "prepaidSum": 0,
      "provisionSum": 0,
      "requestNumber": 237,
      "retailPlace": "ул Спортивная, д 120",
      "shiftNumber": 32,
      "taxationType": 32,
      "appliedTaxationType": 32,
      "totalSum": 23500,
      "user": "БЕЛОВА МАРИЯ ИГОРЕВНА",
      "userInn": "632525178730"
    }
  }
}
}]"""
        }
    }
}
