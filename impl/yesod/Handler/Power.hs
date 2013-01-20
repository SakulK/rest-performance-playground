module Handler.Power where

import Import
import Data.Aeson hiding(object)

data PowerResult = PowerResult { result :: Integer }

instance ToJSON PowerResult where
	toJSON (PowerResult res) = object
		[ "result" .= res ]

power :: Integer -> Integer -> PowerResult
power base pow = PowerResult $ base ^ pow

getPowerR :: Integer -> Integer -> Handler RepJson
getPowerR base pow = do
	jsonToRepJson $ power base pow